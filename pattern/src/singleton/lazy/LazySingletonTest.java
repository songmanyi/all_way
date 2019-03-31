package singleton.lazy;

import java.util.concurrent.TimeUnit;

public class LazySingletonTest {

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new Thread(()->{
                // 性能最优的方案
                LazyInnerClassSingleton.getInstance();
            }).start();
        }

        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("end");

    }

}
