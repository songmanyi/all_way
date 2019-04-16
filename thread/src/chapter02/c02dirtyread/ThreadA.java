package chapter02.c02dirtyread;

public class ThreadA extends Thread {

    private PublicVar publicVar;

    public ThreadA(PublicVar publicVar) {
        this.publicVar = publicVar;
    }

    @Override
    public void run() {
        publicVar.setValue("B", "BB");
    }
}
