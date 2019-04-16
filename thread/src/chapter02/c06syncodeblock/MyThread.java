package chapter02.c06syncodeblock;

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
