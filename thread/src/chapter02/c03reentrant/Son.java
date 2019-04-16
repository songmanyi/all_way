package chapter02.c03reentrant;

public class Son extends Parent {

    synchronized public void sonMethod() {
        try {
            while (i > 0) {
                i--;
                System.out.println("son i->" + i);
                Thread.sleep(100);
                this.parentMethod();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
