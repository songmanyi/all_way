package chapter04.c06fairlock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MyService {

    private Lock lock = null;

    public MyService(boolean isFair) {
        lock = new ReentrantLock(isFair);
    }

    public void test() {
        try {
            lock.lock();
            System.out.println("ThreadName=" + Thread.currentThread().getName() + " ->");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }
}
