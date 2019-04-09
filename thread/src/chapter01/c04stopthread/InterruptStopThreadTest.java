package chapter01.c04stopthread;

public class InterruptStopThreadTest {

    public static void main(String[] args) throws InterruptedException {
        InterruptThread thread = new InterruptThread();
        thread.start();

        // 睡眠1s后中断
        Thread.sleep(1000);
        thread.interrupt();
    }

}
