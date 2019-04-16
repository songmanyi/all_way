package chapter02.c05synnotextends;

public class Parent {

    synchronized public void method() {
        System.out.println("parent method start");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("parent method end");
    }

}
