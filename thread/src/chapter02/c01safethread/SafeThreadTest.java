package chapter02.c01safethread;

public class SafeThreadTest {

    public static void main(String[] args) throws InterruptedException {
        System.out.println("方法内部变量->线程安全:");
        HasSelfPrivateNum num = new HasSelfPrivateNum();
        MyAThread a = new MyAThread(num);
        MyBThread b = new MyBThread(num);
        a.start();
        b.start();
        Thread.sleep(5000);
        System.out.println("实例变量->线程不安全：");
        NoSafeNum noSafeNum = new NoSafeNum();
        MyAThread c = new MyAThread(noSafeNum);
        MyBThread d = new MyBThread(noSafeNum);
        c.start();
        d.start();

    }

}
