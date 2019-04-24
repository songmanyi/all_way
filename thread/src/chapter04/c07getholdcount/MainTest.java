package chapter04.c07getholdcount;

public class MainTest {

    public static void main(String[] args) {
        MyService service = new MyService();
        new Thread(()-> {
            service.method1();
            service.method2();
            service.printHoldCount();
        }).start();
    }

}
