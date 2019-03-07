package com.my.cloudgateway.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import javax.servlet.http.HttpServletRequest;
import java.util.*;

@Component
public class ApiAccessPreFilter extends ZuulFilter {

    private static Logger logger = LoggerFactory.getLogger(ApiAccessPreFilter.class);

    public static final String PARAM_AUTHORIZATION   = "Authorization";

    @Value("${zuul.prefix}")
    private String zuulPrefix;

    @Value("${gate.ignore.startWith}")
    private String startWith;

    @Value("${gate.jersey.startWith}")
    private String JerseyHeader;

    private final Set<String> NO_AUTHORIZATION_PATHS = Collections.unmodifiableSet(new HashSet<>(
            Arrays.asList("")
    ));

    @Autowired
    RestTemplate restTemplate;

    @Override
    public String filterType() {
        return "pre";
    }

    @Override
    public int filterOrder() {
        return 0;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() {
        RequestContext ctx = RequestContext.getCurrentContext();
        HttpServletRequest httpRequest = ctx.getRequest();

        final String requestUri = httpRequest.getRequestURI().substring(zuulPrefix.length());
        final String method = httpRequest.getMethod();

        //获得/*/之后的内容的位置
        int index = requestUri.indexOf("/");
        index = requestUri.indexOf("/", index + 1);
        String path = requestUri.substring(index);
        //获取JerseyHeader之后的内容
        String restPath = path.substring(JerseyHeader.length());
        // 不进行认证的地址,静态文件
        if (isStartWith(restPath)) {
            //对请求进行路由，但不进行权限认证
            ctx.setSendZuulResponse(true);
            ctx.setResponseStatusCode(200);
            ctx.set("isSuccess", true);
            return null;
        }
        // 不进行认证的地址,动态URL
        boolean allowedPath = NO_AUTHORIZATION_PATHS.contains(restPath);
        if (allowedPath || method.equals(HttpMethod.OPTIONS.toString())) {
            //对请求进行路由，但不进行权限认证
            ctx.setSendZuulResponse(true);
            ctx.setResponseStatusCode(200);
            ctx.set("isSuccess", true);
            return null;
        }

        //进行权限校验
        String authorization = httpRequest.getHeader(PARAM_AUTHORIZATION);

        String restUrl = String.format("http://%s/rest/users/authentication", "biz-user");
        Map<String, Object> condition = new HashMap<>();
        condition.put(PARAM_AUTHORIZATION, authorization);
        String result = restTemplate.postForObject(restUrl, condition, String.class);
        if ("true".equalsIgnoreCase(result)) {
            //对请求进行路由
            ctx.setSendZuulResponse(true);
            ctx.setResponseStatusCode(200);
            ctx.set("isSuccess", true);
            return null;
        }

        //不对其进行路由
        ctx.setSendZuulResponse(false);
        ctx.setResponseStatusCode(401);
        ctx.setResponseBody("Unauthorized,Token Is Empty Or Invaild!");
        ctx.set("isSuccess", false);

        return null;
    }

    /**
     * URI是否以什么打头
     *
     * @param requestUri
     * @return
     */
    private boolean isStartWith(String requestUri) {
        boolean flag = false;
        if (StringUtils.isEmpty(startWith) || StringUtils.isEmpty(requestUri)) {
            return flag;
        }
        for (String s : startWith.split(",")) {
            if (requestUri.startsWith(s)) {
                return true;
            }
        }
        return flag;
    }
}
