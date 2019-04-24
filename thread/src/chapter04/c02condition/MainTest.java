package chapter04.c02condition;

public class MainTest {

    public static void main(String[] args) throws InterruptedException {
        MyService service = new MyService();
        MyThread t1 = new MyThread(service);
        t1.start();

        Thread.sleep(300);

        service.sigal();
    }

}
