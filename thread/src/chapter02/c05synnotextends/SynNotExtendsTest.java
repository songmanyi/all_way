package chapter02.c05synnotextends;

import javax.print.attribute.standard.Media;

public class SynNotExtendsTest {

    public static void main(String[] args) {
        Son son = new Son();
        MyThread a = new MyThread(son);
        MyThread b = new MyThread(son);
        a.start();
        b.start();
    }

}
