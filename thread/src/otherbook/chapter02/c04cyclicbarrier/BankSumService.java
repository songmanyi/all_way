package otherbook.chapter02.c04cyclicbarrier;

import java.util.Map;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CyclicBarrier;

public class BankSumService implements Runnable {


    private ConcurrentHashMap<String, Integer> sheetMap = new ConcurrentHashMap<>();

    private CyclicBarrier cyclicBarrier = new CyclicBarrier(4, this);

    public void count() {

        // 启动四个线程，每个计算数，并放出到map中
        for (int i = 0; i < 4; i++) {
            new Thread(() -> {
                sheetMap.put(Thread.currentThread().getName(), 1);
                try {
                    cyclicBarrier.await();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } catch (BrokenBarrierException e) {
                    e.printStackTrace();
                }
            }).start();
        }
    }

    @Override
    public void run() {
        int result = 0;
        for (Map.Entry<String, Integer> sheet : sheetMap.entrySet()) {
            if (sheet != null) {
                result += sheet.getValue();
            }
        }
        System.out.println(result);
    }

    public static void main(String[] args) {
        BankSumService sumService = new BankSumService();
        sumService.count();
    }
}
