package chapter03.c05yipyic;

public class YiPYiCTest {

    public static void main(String[] args) {
        Object lock = new Object();
        PThread p = new PThread(lock);
        p.start();
        CThread c = new CThread(lock);
        CThread c1 = new CThread(lock);
        CThread c2 = new CThread(lock);
        c.start();
        c1.start();
        c2.start();
    }

}
