package chapter03.c05yipyic;

public class PThread extends Thread {

    private Object lock;

    public PThread(Object lock) {
        this.lock = lock;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (lock) {
                if (ValueObject.value.equals("")) {
                    System.out.println("value is null-set value");
                    // 需要制作
                    ValueObject.value = System.currentTimeMillis() + "-" + System.nanoTime();
                    lock.notifyAll();
                } else {
                    System.out.println("value is not null-to wait");
                    try {
                        lock.wait();
                        System.out.println("value is not null-to start");
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}
