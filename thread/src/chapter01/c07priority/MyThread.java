package chapter01.c07priority;

public class MyThread extends Thread {

    private String name;

    public MyThread(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        long startTime = System.currentTimeMillis();
        int count = 0;
        for (int i = 0; i < 99999999; i++) {
            count++;
        }
        long endTime = System.currentTimeMillis();
        System.out.println(name + " 用时->" + (endTime - startTime));
    }
}
