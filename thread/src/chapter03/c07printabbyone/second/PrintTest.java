package chapter03.c07printabbyone.second;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class PrintTest {

    public static void main(String[] args) throws InterruptedException {
        Object lock = new Object();
        PrintAThead a = new PrintAThead(lock, "A");
        PrintAThead b = new PrintAThead(lock, "B");
        a.start();
        Thread.sleep(300);
        b.start();
    }

}
