package chapter02.c09dealcycle;

public class PrintString extends Thread {

    private boolean isStop = true;

    public boolean isStop() {
        return isStop;
    }

    public void setStop(boolean stop) {
        isStop = stop;
    }

    public void print() {
        while(isStop) {
            System.out.println("print not stop");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("print stop");
    }

    @Override
    public void run() {
        print();
    }
}
