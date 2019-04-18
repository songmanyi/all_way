package chapter03.c05yipyic;

public class CThread extends Thread {

    private Object lock;

    public CThread(Object lock) {
        this.lock = lock;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (lock) {
                System.out.println("get lock");
                if (!ValueObject.value.equals("")) {
                    System.out.println("get value->" + ValueObject.value);
                    lock.notifyAll();
                    ValueObject.value = "";
                } else {
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}
