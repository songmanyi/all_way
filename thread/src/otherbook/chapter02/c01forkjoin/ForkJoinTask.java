package otherbook.chapter02.c01forkjoin;

import java.util.concurrent.RecursiveTask;

public class ForkJoinTask extends RecursiveTask<Integer> {

    private static final int THRESHOLD = 2;

    private int start;
    private int end;

    public ForkJoinTask(int start, int end) {
        this.start = start;
        this.end = end;
    }


    @Override
    protected Integer compute() {
        System.out.println("start->" + start + " end:" + end + " 开始->" + System.currentTimeMillis());
        int sum = 0;
        if (end - start <= THRESHOLD) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            for (int i = start; i < end; i++) {
                sum += i;
            }
        } else {
            // 大于阈值，则分裂成两个子任务
            int middle = (start + end) / 2;
            ForkJoinTask leftTask = new ForkJoinTask(start, middle);
            ForkJoinTask rightTask = new ForkJoinTask(middle+1, end);
            // 执行子任务
            leftTask.fork();
            rightTask.fork();
            sum = leftTask.join() + rightTask.join();
        }
        System.out.println("start->" + start + " end:" + end + " 结束->" + System.currentTimeMillis());
        return sum;
    }
}
