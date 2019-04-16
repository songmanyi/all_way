package chapter02.c04exceptionstop;

public class MyThread extends Thread {

    private PublicVar publicVar;

    public MyThread(PublicVar publicVar) {
        this.publicVar = publicVar;
    }

    @Override
    public void run() {
        publicVar.setValue();
    }
}
