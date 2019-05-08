package otherbook.chapter02.c03countdownlatch;

import java.util.concurrent.CountDownLatch;

public class CountDownLatchTest {

    public static void main(String[] args) throws InterruptedException {

        CountDownLatch countDownLatch = new CountDownLatch(10);

        for (int i = 0; i < 15; i++) {
            MyThread thread = new MyThread(countDownLatch);
            thread.start();
        }
        countDownLatch.await();
        System.out.println("end");

    }

}
