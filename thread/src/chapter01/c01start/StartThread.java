package chapter01.c01start;

public class StartThread extends Thread{

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + "：开始");
        System.out.println("执行");
        System.out.println(Thread.currentThread().getName() + "：结束");
    }
}
