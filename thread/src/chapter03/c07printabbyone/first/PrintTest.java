package chapter03.c07printabbyone.first;

public class PrintTest {
    public static void main(String[] args) throws InterruptedException {
        Object a = new Object();
        Object b = new Object();
        Object c = new Object();

        PrintThread printa = new PrintThread(b, a, "A");
        PrintThread printb = new PrintThread(a, b, "B");
        PrintThread printc = new PrintThread(b, c, "C");

        printa.start();
        Thread.sleep(300);
        printb.start();
        Thread.sleep(300);
        printc.start();

    }
}
