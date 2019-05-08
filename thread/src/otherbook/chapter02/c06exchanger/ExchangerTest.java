package otherbook.chapter02.c06exchanger;

import java.util.concurrent.Exchanger;

public class ExchangerTest {

    public static void main(String[] args) {

        Exchanger<String> exchanger = new Exchanger<>();

        new Thread(()->{
            String a = "我是A";
            System.out.println("交换A->" + a);
            try {
                String b = exchanger.exchange(a);
                System.out.println("A中获得B->" + b);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();

        new Thread(()->{
            String b = "我是B";
            System.out.println("交换b->" + b);
            try {
                Thread.sleep(3000);
                String a = exchanger.exchange(b);
                System.out.println("B中获得A->" + a);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();

    }

}
