package chapter02.c03reentrant;

public class MyThread extends Thread {

    @Override
    public void run() {
        Son son = new Son();
        son.sonMethod();
    }
}
