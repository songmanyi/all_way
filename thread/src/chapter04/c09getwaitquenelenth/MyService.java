package chapter04.c09getwaitquenelenth;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class MyService {

    private ReentrantLock lock = new ReentrantLock();
    private Condition condition = lock.newCondition();
    public void method() {
        try {
            lock.lock();
            condition.await();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

    public void print() {
        lock.lock();
        System.out.println(lock.getWaitQueueLength(condition));
        lock.unlock();
    }

}
