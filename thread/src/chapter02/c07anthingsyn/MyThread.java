package chapter02.c07anthingsyn;

public class MyThread extends Thread {

    private PublicVar publicVar;

    public MyThread(PublicVar publicVar) {
        this.publicVar = publicVar;
    }

    @Override
    public void run() {
        publicVar.method();
    }
}
