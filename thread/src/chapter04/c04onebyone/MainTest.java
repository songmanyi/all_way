package chapter04.c04onebyone;

public class MainTest {

    public static void main(String[] args) {

        MyPrint print = new MyPrint();

        new Thread(()->{
            while(true) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                print.printA();
            }
        }).start();

        new Thread(()->{
            while(true) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                print.printB();
            }
        }).start();

    }

}
