package proxy.dynamicproxy.myjdkproxy;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class MyMeipo implements MyInvocationHandler {

    private Object target;

    public Object getInstance(Object target) {
        this.target = target;
        Class<?> clazz = target.getClass();
        return MyProxy.newProxyInstance(new MyClassLoader(), clazz.getInterfaces(), this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws InvocationTargetException, IllegalAccessException {
        before();
        Object obj = method.invoke(this.target,args);
        after();
        return obj;
    }

    private void before(){
        System.out.println("开始物色");
    }

    private void after(){
        System.out.println("OK的话，准备办事");
    }

}
