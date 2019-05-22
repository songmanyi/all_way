package proxy.dynamicproxy.jdkproxy;

import java.lang.reflect.Method;

public class JDKProxyTest {

    public static void main(String[] args) throws Exception {

        System.getProperties().put("sun.misc.ProxyGenerator.saveGeneratedFiles", "true");

        // JDK动态代理实现
        Person person = (Person) new MeipoJDKProxy().getInstance(new Girl());
        person.findLove();
        person.findOther();
    }

}
