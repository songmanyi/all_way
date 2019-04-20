package chapter03.c07printabbyone.third;

public class MainTest {

    public static void main(String[] args) {

        Print p = new Print();

        for (int i = 0; i < 10; i++) {
            ThreadA a = new ThreadA(p);
            a.start();
            ThreadB b = new ThreadB(p);
            b.start();
        }

    }

}
