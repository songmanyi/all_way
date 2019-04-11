package chapter01.c05suspendandresume;

import java.util.concurrent.TimeUnit;

public class SuspendResumeTest {

    public static int count = 0;

    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(()->{
            while (true) {
                count++;
            }
        });
        thread.start();
        Thread.sleep(30);
        thread.suspend();
        System.out.println("suspend pre->" + count);
        TimeUnit.SECONDS.sleep(1);
        System.out.println("suspend after->" + count);
        thread.resume();
        Thread.sleep(30);
        System.out.println("resume after->" + count);
        TimeUnit.SECONDS.sleep(3);
        thread.stop();
    }

}
