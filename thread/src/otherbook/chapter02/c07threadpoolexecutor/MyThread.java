package otherbook.chapter02.c07threadpoolexecutor;

public class MyThread implements Runnable {

    private int num = 0;

    public MyThread(int num) {
        this.num = num;
    }

    @Override
    public void run() {
        System.out.println("正在执行线程->" + num);
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("线程 " + num + " 执行完成");
    }
}
