package chapter02.c04exceptionstop;

public class ExceptionStopTest {

    public static void main(String[] args) throws InterruptedException {
        PublicVar publicVar = new PublicVar();
        MyThread myThread = new MyThread(publicVar);
        myThread.start();
        Thread.sleep(1000);
        publicVar.getValue();
        System.out.println("END");
    }

}
