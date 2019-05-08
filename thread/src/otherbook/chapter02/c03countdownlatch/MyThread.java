package otherbook.chapter02.c03countdownlatch;

import java.util.concurrent.CountDownLatch;

public class MyThread extends Thread {

    private CountDownLatch countDownLatch = null;

    public MyThread(CountDownLatch countDownLatch) {
        this.countDownLatch = countDownLatch;
    }

    @Override
    public void run() {
        countDownLatch.countDown();
        System.out.println(countDownLatch.getCount() + " -> 1");
    }
}
