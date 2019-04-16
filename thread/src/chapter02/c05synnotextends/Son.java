package chapter02.c05synnotextends;

public class Son extends Parent {

    @Override
    public void method() {
        System.out.println("son method start");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("son method end");
    }
}
