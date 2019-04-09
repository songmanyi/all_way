package chapter01.c04stopthread;

public class InterruptThread extends Thread {

    @Override
    public void run() {
        for (int i = 0; i < 500000; i++) {
            if (this.isInterrupted()) {
                // 如果中断，则退出循环
                System.out.println("->中断了");
//                break;
//                throw new RuntimeException("需要线程中断");
                return;
            }
            System.out.println(i);
        }
        System.out.println("->执行线程run结束");
    }
}
