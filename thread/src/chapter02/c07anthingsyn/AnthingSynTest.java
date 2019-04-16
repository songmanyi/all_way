package chapter02.c07anthingsyn;

public class AnthingSynTest {

    public static void main(String[] args) {

        PublicVar var = new PublicVar();
        MyThread a = new MyThread(var);
        MyThread b = new MyThread(var);
        a.start();
        b.start();

    }

}
