package chapter03.c07printabbyone.second;

import java.util.concurrent.locks.Lock;

public class PrintAThead extends Thread {

    private Object lock;

    private String printValue;

    public PrintAThead(Object lock, String printValue) {
        this.lock = lock;
        this.printValue = printValue;
    }

    @Override
    public void run() {
        while(true) {
            synchronized (lock) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                try {
                    System.out.println(printValue);
                    lock.notifyAll();
                    lock.wait();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
