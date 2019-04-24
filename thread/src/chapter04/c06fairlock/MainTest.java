package chapter04.c06fairlock;

public class MainTest {

    public static void main(String[] args) {
        MyService service = new MyService(false);

        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("ThradName=" + Thread.currentThread().getName() + " <-");
                service.test();
            }
        };
        Thread[] threads = new Thread[10];
        for (int i = 0; i < 10; i++) {
            threads[i] = new Thread(runnable);
        }

        for (int i = 0; i < 10; i++) {
            threads[i].start();
        }

    }

}
