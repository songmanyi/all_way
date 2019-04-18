package chapter03.c02waitnotify;

public class NotifyThread extends Thread {

    private Object lock;

    public NotifyThread(Object lock) {
        this.lock = lock;
    }

    @Override
    public void run() {
        synchronized (lock) {
            System.out.println("NotifyThread->start");
            try {
                lock.notify();
            } catch (Exception e) {
                e.printStackTrace();
            }
            System.out.println("NotifyThread->end");
        }
    }
}
