package chapter01.c08deamon;

import java.util.concurrent.TimeUnit;

public class DeamonThreadTest {

    public static void main(String[] args) throws InterruptedException {
        MyThread thread = new MyThread();
        thread.setDaemon(true);
        thread.start();
        TimeUnit.SECONDS.sleep(5);
        System.out.println("主线程结束了，不存在非守护线程，自动销毁，停止打印");
    }

}
