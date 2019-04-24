package chapter04.c01reetrantlock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MyService {

    private Lock lock = new ReentrantLock();

    public void test() {
        System.out.println("ThreadName=" + Thread.currentThread().getName() + "lock");
        lock.lock();
        for (int i = 0; i < 10; i++) {
            System.out.println("ThreadName=" + Thread.currentThread().getName() + ", i=" + (i + 1));
        }
        System.out.println("ThreadName=" + Thread.currentThread().getName() + "unlock");
        lock.unlock();
    }

}
