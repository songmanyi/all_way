package chapter03.c06yipyicstack;

public class MainTest {

    public static void main(String[] args) {
//        MyStack myStack = new MyStack();
//        P p = new P(myStack);
//        C c = new C(myStack);
//        PThread pThread = new PThread(p);
//        CThread cThread = new CThread(c);
//        pThread.start();
//        cThread.start();

        MyStack myStack = new MyStack();
        P p = new P(myStack);
        C c = new C(myStack);
        C c1 = new C(myStack);
        C c2 = new C(myStack);
        C c3 = new C(myStack);
        C c4 = new C(myStack);
        C c5 = new C(myStack);

        new PThread(p).start();

        new CThread(c).start();
        new CThread(c1).start();
        new CThread(c2).start();
        new CThread(c3).start();
        new CThread(c4).start();
        new CThread(c5).start();

    }

}
