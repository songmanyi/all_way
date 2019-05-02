package J02stringtest;

public class StringTest {

    public static void main(String[] args) throws InterruptedException {
        new Thread(()->{
            while (true) {
                int a = 2;
                int b = 400;
                int c = a + b;
                System.out.println(c);
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();
    }
}
