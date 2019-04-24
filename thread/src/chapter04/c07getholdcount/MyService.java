package chapter04.c07getholdcount;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MyService {

    private ReentrantLock lock = new ReentrantLock();

    public void method1() {
        lock.lock();
        System.out.println("exe method1");

        lock.unlock();
    }

    public void method2() {
        lock.lock();
        System.out.println("exe method2");

        lock.unlock();
    }

    public void printHoldCount() {
        System.out.println("getHoldCount->" + lock.getHoldCount());
    }

}
