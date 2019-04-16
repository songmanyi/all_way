package chapter02.c08deadlock;

public class DeadLockTest {

    public static void main(String[] args) throws InterruptedException {
        DeadLockThread thread = new DeadLockThread();
        thread.setFlag(true);
        new Thread(thread).start();
        Thread.sleep(100);
        thread.setFlag(false);
        new Thread(thread).start();
    }

}
