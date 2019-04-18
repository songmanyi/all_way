package chapter03.c03waitnotifyall;

public class WaitNotifyAllTest {

    public static void main(String[] args) throws InterruptedException {
        Object lock = new Object();

        WaitThread a = new WaitThread(lock);
        WaitThread b = new WaitThread(lock);
        WaitThread c = new WaitThread(lock);
        a.start();
        b.start();
        c.start();

        Thread.sleep(300);

        NotifyThread notifyThread = new NotifyThread(lock);
        notifyThread.start();

    }

}
