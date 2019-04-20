package chapter03.c07printabbyone.third;

public class ThreadB extends Thread {

    private Print print;

    public ThreadB(Print print) {
        this.print = print;
    }

    @Override
    public void run() {
        print.printB();
    }
}
