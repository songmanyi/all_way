package chapter04.c05morebymore;

public class MyThreadB extends Thread {

    private MyPrint print;

    public MyThreadB(MyPrint print) {
        this.print = print;
    }

    @Override
    public void run() {
        while (true) {
            print.printB();
        }
    }
}
