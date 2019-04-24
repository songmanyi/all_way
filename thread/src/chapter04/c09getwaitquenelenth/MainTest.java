package chapter04.c09getwaitquenelenth;

public class MainTest {

    public static void main(String[] args) throws InterruptedException {
        MyService service = new MyService();
        new Thread(()->{
            service.method();
        }).start();
        new Thread(()->{
            service.method();
        }).start();
        new Thread(()->{
            service.method();
        }).start();
        new Thread(()->{
            service.method();
        }).start();
        new Thread(()->{
            service.method();
        }).start();
        Thread.sleep(300);

        service.print();

    }

}
