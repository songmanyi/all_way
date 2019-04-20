package chapter03.c07printabbyone.third;

public class ThreadA extends Thread {

    private Print print;

    public ThreadA(Print print) {
        this.print = print;
    }

    @Override
    public void run() {
        print.printA();
    }
}
