package chapter02.c01safethread;

public class MyBThread extends Thread {

    private INum num;

    public MyBThread(INum num) {
        this.num = num;
    }

    @Override
    public void run() {
        num.add("b");
    }
}
