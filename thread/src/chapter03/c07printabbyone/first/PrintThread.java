package chapter03.c07printabbyone.first;

public class PrintThread extends Thread {

    private Object pre;
    private Object self;
    private String printValue;

    public PrintThread(Object pre, Object self, String printValue) {
        this.pre = pre;
        this.self = self;
        this.printValue = printValue;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (pre) {
                synchronized (self) {
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(printValue);
                    self.notify();
                }
                try {
                    pre.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
