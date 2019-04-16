package chapter02.c04exceptionstop;

public class PublicVar {

    synchronized public void setValue() {
        System.out.println("setValue start");
        try {
            Thread.sleep(5000);
        } catch (Exception e) {
            e.printStackTrace();
        }
        int i = 10;
        i = i / 0;
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("setValue end");
    }

    synchronized public void getValue() {
        System.out.println("getValue executor");
    }

}
