package chapter04.c08getquenelength;

public class MainTest {

    public static void main(String[] args) throws InterruptedException {
        MyService service = new MyService();
        new Thread(()->{
            service.test();
        }).start();
        new Thread(()->{
            service.test();
        }).start();
        new Thread(()->{
            service.test();
        }).start();
        Thread.sleep(300);
        // 一个已经获得锁了，有两个在等待锁的释放
        service.print();
    }

}
