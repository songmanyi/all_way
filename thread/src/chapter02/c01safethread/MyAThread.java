package chapter02.c01safethread;

public class MyAThread extends Thread {

    private INum num;

    public MyAThread(INum num) {
        this.num = num;
    }

    @Override
    public void run() {
        num.add("a");
    }
}
