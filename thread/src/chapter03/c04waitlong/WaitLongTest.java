package chapter03.c04waitlong;

public class WaitLongTest {

    public static void main(String[] args) throws InterruptedException {

        String lock = new String("");
        synchronized (lock) {
            lock.wait(5000);
        }

    }

}
