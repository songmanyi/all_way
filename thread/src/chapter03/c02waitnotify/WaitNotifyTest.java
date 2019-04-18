package chapter03.c02waitnotify;

public class WaitNotifyTest {

    public static void main(String[] args) {

        Object lock = new Object();
        WaitThread waitThread = new WaitThread(lock);
        waitThread.start();
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        NotifyThread notifyThread = new NotifyThread(lock);
        notifyThread.start();

    }

}
