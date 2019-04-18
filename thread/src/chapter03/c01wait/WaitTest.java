package chapter03.c01wait;

public class WaitTest {

    public static void main(String[] args) throws InterruptedException {

        String newString = new String("");
        synchronized (newString) {
            newString.wait();
        }
        // 没有notify，就一直等待下去了
    }

}
