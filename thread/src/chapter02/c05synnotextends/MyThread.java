package chapter02.c05synnotextends;

public class MyThread extends Thread {

    private Son son;

    public MyThread(Son son) {
        this.son = son;
    }

    @Override
    public void run() {
        son.method();
    }
}
