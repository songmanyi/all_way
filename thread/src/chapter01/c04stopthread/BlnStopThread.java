package chapter01.c04stopthread;

public class BlnStopThread extends Thread {

    private boolean stop = false;

    @Override
    public void run() {
        for (int i = 0; i < 500000 && !stop; i++) {
            System.out.println(i);
        }
        System.out.println("->线程run结束");
    }

    public boolean isStop() {
        return stop;
    }

    public void setStop(boolean stop) {
        this.stop = stop;
    }
}
