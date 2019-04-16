package chapter02.c09dealcycle;

public class DeadCycleTest {

    public static void main(String[] args) throws InterruptedException {
        PrintString p = new PrintString();
        p.start();
        Thread.sleep(5000);
        p.setStop(false);
    }

}
