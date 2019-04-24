package chapter04.c05morebymore;

public class MyThreadA extends Thread {

    private MyPrint print;

    public MyThreadA(MyPrint print) {
        this.print = print;
    }

    @Override
    public void run() {
        while (true) {
            print.printA();
        }
    }
}
