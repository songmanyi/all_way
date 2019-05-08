package otherbook.chapter02.c04cyclicbarrier;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class CyclicBarrierTest {

    public static void main(String[] args) throws InterruptedException, BrokenBarrierException {

        CyclicBarrier cyclicBarrier = new CyclicBarrier(2);

        new Thread(()->{
            System.out.println("start-1");
            try {
                Thread.sleep(3000);
                cyclicBarrier.await();
                System.out.println("end-1");
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (BrokenBarrierException e) {
                e.printStackTrace();
            }

        }).start();
        System.out.println("start-2");

        cyclicBarrier.await();
        System.out.println("end-2");

    }

}
