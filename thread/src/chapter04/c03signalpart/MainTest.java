package chapter04.c03signalpart;

public class MainTest {

    public static void main(String[] args) throws InterruptedException {
        MyService service = new MyService();
        ThreadA a = new ThreadA(service);
        ThreadB b = new ThreadB(service);
        a.start();
        b.start();

        Thread.sleep(300);

        service.signalA();
    }

}
