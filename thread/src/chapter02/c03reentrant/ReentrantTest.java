package chapter02.c03reentrant;

public class ReentrantTest {

    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.run();
    }

}
