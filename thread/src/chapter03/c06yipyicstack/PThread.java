package chapter03.c06yipyicstack;

public class PThread extends Thread {

    private P p;

    public PThread(P p) {
        this.p = p;
    }

    @Override
    public void run() {
        while(true) {
            p.pushService();
        }
    }
}
