package chapter01.c02variable;

public class VariableTest {

    public static void main(String[] args) throws InterruptedException {
        // 变量不共享
        System.out.println("---------变量不共享-----------");
        NotSharedVariableThread a = new NotSharedVariableThread("A");
        NotSharedVariableThread b = new NotSharedVariableThread("B");
        NotSharedVariableThread c = new NotSharedVariableThread("C");
        a.start();
        b.start();
        c.start();

        // 变量共享
        Thread.sleep(1000);
        System.out.println("---------变量共享（1）-----------");
        NotSharedVariableThread d = new NotSharedVariableThread("共享");
        new Thread(d).start();
        new Thread(d).start();
        new Thread(d).start();
        Thread.interrupted();

        // 变量共享
        Thread.sleep(1000);
        System.out.println("---------变量共享（2）-----------");
        MyData myData = new MyData();
        SharedVariableThread e = new SharedVariableThread("E", myData);
        SharedVariableThread f = new SharedVariableThread("F",myData);
        SharedVariableThread g = new SharedVariableThread("G",myData);
        e.start();
        f.start();
        g.start();

    }
}
