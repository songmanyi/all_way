package chapter02.c03reentrant;

public class Parent {

    protected int i = 10;

    synchronized public void parentMethod() {
        try {
            i--;
            System.out.println("parent i->" + i);
            Thread.sleep(100);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
