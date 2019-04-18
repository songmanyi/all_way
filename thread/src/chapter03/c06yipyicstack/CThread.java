package chapter03.c06yipyicstack;

public class CThread extends Thread {

    private C c;

    public CThread(C c) {
        this.c = c;
    }

    @Override
    public void run() {
        while(true) {
            c.popService();
        }
    }
}
