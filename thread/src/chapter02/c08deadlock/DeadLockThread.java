package chapter02.c08deadlock;

public class DeadLockThread implements Runnable {

    private boolean flag = false;

    private Object lock1 = new Object();
    private Object lock2 = new Object();

    @Override
    public void run() {
        if (flag) {
            synchronized (lock1) {
                System.out.println("获得锁1");
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (lock2) {
                    System.out.println("获得锁2");
                }
            }
        } else {
            synchronized (lock2) {
                System.out.println("->获得锁2");
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (lock1) {
                    System.out.println("->获得锁1");
                }
            }
        }
    }

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }
}
