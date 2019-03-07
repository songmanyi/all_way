package com.my.bizuser.controller;

import com.my.bizcommon.data.AppDefs;
import com.my.bizcommon.dto.SimpleRestResult;
import com.my.bizuser.data.Constant;
import com.my.bizuser.data.dto.UserDTO;
import com.my.bizuser.data.signature.ClientSubject;
import com.my.bizuser.entity.User;
import com.my.bizuser.service.UserService;
import com.my.bizuser.util.ConvertUtil;
import com.my.bizuser.util.JwtUtil;
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.constraints.NotNull;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;
import java.util.Map;

@RestController
@Path("/users")
public class UserController {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private ClientSubject clientSubject;

    @Autowired
    private UserService userService;

    @POST
    @Path("/login")
    @Produces(MediaType.APPLICATION_JSON)
    public SimpleRestResult login(@NotNull @FormParam("account") String account,
                                  @NotNull @FormParam("password") String password) {
        SimpleRestResult result = new SimpleRestResult();

        User user = userService.selectUserByAccount(account);
        if (user != null && password.equals(user.getPassword())) {
            String accessToken = JwtUtil.createJWT(user.getAccount(), clientSubject.getClientId(), clientSubject.getName(),
                    clientSubject.getExpiresSecond() * 1000, clientSubject.getBase64Secret());

            UserDTO userDTO = (UserDTO) ConvertUtil.convertToDTO(user, UserDTO.class);
            userDTO.setToken(accessToken);

            result.setData(userDTO);
            result.setSuccess(true);
        } else {
            // 返回用户名错误
            result.setMessage(AppDefs.ResultMessage.MSG_USER_OR_PASSWORD_ERROR.getMessage());
            result.setErrorCode(AppDefs.ResultMessage.MSG_USER_OR_PASSWORD_ERROR.getCode());
        }

        return result;
    }

    @POST
    @Path("/authentication")
    public String authentication(Map<String, Object> condition) {
        // 对参数进行判断
        if (condition == null || condition.get(Constant.AUTHORIZATION) == null) {
            logger.info("authentication -> " + AppDefs.ResultMessage.MSG_PARAM_ERROR.getMessage());
            return "false";
        }
        // 后续通过redis，对权限进行超期时长控制
        return "true";
    }

}
