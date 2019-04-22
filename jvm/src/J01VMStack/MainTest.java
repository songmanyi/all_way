package J01VMStack;

public class MainTest {

    public static void main(String[] args) {
//        HelloWorld helloWorld = new HelloWorld();
//        helloWorld.test(1);

        Object obj = new Object();
        synchronized (obj) {
            try {
                obj.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }

}
