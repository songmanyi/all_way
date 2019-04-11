package chapter01.c06yield;

public class YieldThread extends Thread {

    @Override
    public void run() {
        long startTime = System.currentTimeMillis();
        int count = 0;
        for (int i = 0; i < 1000000; i++) {
            // 不做处理
            Thread.yield();
            count += i;
        }
        long endTime = System.currentTimeMillis();
        System.out.println("用时->" + (endTime - startTime));
    }
}
