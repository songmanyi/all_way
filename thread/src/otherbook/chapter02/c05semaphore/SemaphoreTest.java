package otherbook.chapter02.c05semaphore;

import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

public class SemaphoreTest {

    public static void main(String[] args) {
        Semaphore semaphore = new Semaphore(10);
        for (int i = 0; i < 30; i ++) {
            new Thread(()->{
                try {
                    semaphore.acquire();
                    TimeUnit.SECONDS.sleep(3);
                    System.out.println("save data");
                    semaphore.release();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }).start();
        }
    }


}
