package chapter04.c05morebymore;

public class MainTest {

    public static void main(String[] args) {

        MyPrint print = new MyPrint();

        MyThreadA a1 = new MyThreadA(print);
        MyThreadA a2 = new MyThreadA(print);
        MyThreadA a3 = new MyThreadA(print);
        MyThreadA a4 = new MyThreadA(print);
        MyThreadA a5 = new MyThreadA(print);
        MyThreadA a6 = new MyThreadA(print);
        a1.start();
        a2.start();
        a3.start();
        a4.start();
        a5.start();
        a6.start();

        MyThreadB b1 = new MyThreadB(print);
        MyThreadB b2 = new MyThreadB(print);
        MyThreadB b3 = new MyThreadB(print);
        MyThreadB b4 = new MyThreadB(print);
        MyThreadB b5 = new MyThreadB(print);
        MyThreadB b6 = new MyThreadB(print);
        b1.start();
        b2.start();
        b3.start();
        b4.start();
        b5.start();
        b6.start();

    }

}
