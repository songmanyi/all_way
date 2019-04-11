package chapter01.c06yield;

public class YieldTest {

    public static void main(String[] args) {
        YieldThread thread = new YieldThread();
        thread.start();
        // 不含yield方法：用时->4
        // 含yield方法：用时->413
    }

}
