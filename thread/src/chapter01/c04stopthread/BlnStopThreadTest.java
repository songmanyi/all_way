package chapter01.c04stopthread;

public class BlnStopThreadTest {

    public static void main(String[] args) throws InterruptedException {
        BlnStopThread thread = new BlnStopThread();
        thread.start();
        // 主线程休眠1s
        Thread.sleep(1000);
        // 设置标志位为false
        thread.setStop(true);

    }

}
