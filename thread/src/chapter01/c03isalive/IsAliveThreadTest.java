package chapter01.c03isalive;

public class IsAliveThreadTest {

    public static void main(String[] args) {
        System.out.println("开始");

        Thread thread = new Thread(()->{
//            try {
//                Thread.currentThread().sleep(1000);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
            System.out.println("线程执行完成");
        });
        thread.start();
        if (thread.isAlive()) {
            System.out.println("线程还存活");
        } else {
            System.out.println("线程已终止");
        }
        System.out.println("结束");
    }

}
