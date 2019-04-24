package chapter04.c04onebyone;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MyPrint {

    private Lock lock = new ReentrantLock();
    private Condition condition = lock.newCondition();

    private volatile boolean printBln = false;

    public void printA() {
        try {
            lock.lock();
            if (printBln == false) {
                condition.await();
            }
            System.out.println("A");
            printBln = false;
            condition.signal();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

    public void printB() {
        try {
            lock.lock();
            if (printBln == true) {
                condition.await();
            }
            System.out.println("B");
            printBln = true;
            condition.signal();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

}
