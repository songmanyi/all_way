package chapter01.c04stopthread;

public class StopMethodThreadTest {

    public static void main(String[] args) throws InterruptedException {
        BlnStopThread thread = new BlnStopThread();
        thread.start();

        // 1s 后强制结束
        Thread.sleep(1000);
        thread.stop();
    }

}
