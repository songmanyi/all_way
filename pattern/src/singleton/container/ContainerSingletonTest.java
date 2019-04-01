package singleton.container;

import java.util.concurrent.Executor;

public class ContainerSingletonTest {

    public static void main(String[] args) {
        // 普通测试
//        Object obj = ContainerSingleton.getBean("singleton.container.Pojo");
//        Object obj1 = ContainerSingleton.getBean("singleton.container.Pojo");
//        System.out.println(obj == obj1);

        // 线程安全测试
        for (int i = 0; i < 10; i++) {
            new Thread(()->{
                Object obj = ContainerSingleton.getBean("singleton.container.Pojo");
                System.out.println(obj);
            }).start();
        }


    }

}
