package chapter02.c02dirtyread;

public class DirtyReadTest {

    public static void main(String[] args) throws InterruptedException {
        PublicVar publicVar = new PublicVar();
        ThreadA threadA = new ThreadA(publicVar);
        threadA.start();

        Thread.sleep(1000);

        publicVar.getValue();

        System.out.println("END");

    }

}
