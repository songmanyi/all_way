package chapter01.c08deamon;

import java.util.concurrent.TimeUnit;

public class MyThread extends Thread {

    @Override
    public void run() {
        int i = 0;
        while (true) {
            i++;
            System.out.println("i->" + i);
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
