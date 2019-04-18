package chapter03.c02waitnotify;

public class WaitThread extends Thread {

    private Object lock;

    public WaitThread(Object lock) {
        this.lock = lock;
    }

    @Override
    public void run() {
        synchronized (lock) {
            System.out.println("WaitThread->start");
            try {
                lock.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("WaitThread->end");
        }
    }
}
