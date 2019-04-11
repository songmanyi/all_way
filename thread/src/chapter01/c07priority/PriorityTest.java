package chapter01.c07priority;

public class PriorityTest {

    public static void main(String[] args) {
        // 打印默认的优先级
        System.out.println(Thread.currentThread().getPriority());

        MyThread a = new MyThread("A");
        MyThread b = new MyThread("B");
        a.setPriority(Thread.MIN_PRIORITY);
        b.setPriority(Thread.MAX_PRIORITY);
        a.start();
        b.start();

    }

}
