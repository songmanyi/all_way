package chapter01.c01start;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class StartTest {

    public static void main(String[] args) throws InterruptedException, ExecutionException {
        // 集成Thread
        StartThread thread = new StartThread();
        thread.start();

        Thread.sleep(1000);

        // new Thread
        new Thread(()->{
            System.out.println(Thread.currentThread().getName() + "：开始");
            System.out.println("执行");
            System.out.println(Thread.currentThread().getName() + "：结束");
        }).start();

        Thread.sleep(1000);

        // 实现Runnable接口
        StartRunnable runnable = new StartRunnable();
        Thread runnableThread = new Thread(runnable);
        runnableThread.start();

        // 带返回值：callable
        StartCallable callable = new StartCallable();
        ExecutorService executorService = Executors.newCachedThreadPool();
        Future<String> future = executorService.submit(callable);
        System.out.println(future.get());
    }

}
