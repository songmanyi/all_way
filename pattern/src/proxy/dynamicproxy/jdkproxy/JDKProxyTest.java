package proxy.dynamicproxy.jdkproxy;

import java.lang.reflect.Method;

public class JDKProxyTest {

    public static void main(String[] args) throws Exception {
        // JDK动态代理实现
        Person person = (Person) new MeipoJDKProxy().getInstance(new Girl());
        person.findLove();
    }

}
