package otherbook.chapter01.c01threadandcommon;

public class MainTest {

    private final static int count = 1000000000;

    public static void main(String[] args) throws InterruptedException {
        commonFor();
        threadFor();
    }

    private static void commonFor() {

        long startTime = System.currentTimeMillis();
        for (int i = 0; i < count; i++) {
            int a = 0;
            for (int j = 0; j < count; j++) {
                a++;
            }
        }

        for (int i = 0; i < count; i++) {
            int b = 0;
            for (int j = 0; j < count; j++) {
                b--;
            }
        }
        long endTime = System.currentTimeMillis();
        System.out.println("common->" + (endTime - startTime));

    }

    private static void threadFor() throws InterruptedException {
        long startTime = System.currentTimeMillis();
        Thread thread = new Thread(()->{
            for (int i = 0; i < count; i++) {
                int a = 0;
                for (int j = 0; j < count; j++) {
                    a++;
                }
            }
        });
        thread.start();
        for (int i = 0; i < count; i++) {
            int b = 0;
            for (int j = 0; j < count; j++) {
                b--;
            }
        }
        thread.join();
        long endTime = System.currentTimeMillis();
        System.out.println("thread->" + (endTime - startTime));
    }

}
