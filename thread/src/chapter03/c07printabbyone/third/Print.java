package chapter03.c07printabbyone.third;

public class Print {

    volatile private boolean printaBln = false;

    synchronized public void printA() {
        while (printaBln) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("A");
        printaBln = true;
        notifyAll();
    }

    synchronized public void printB() {
        while (!printaBln) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("B");
        printaBln = false;
        notifyAll();
    }

}
