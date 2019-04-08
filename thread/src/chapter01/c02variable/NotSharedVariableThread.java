package chapter01.c02variable;

public class NotSharedVariableThread extends Thread {

    private int count = 5;

    public NotSharedVariableThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        while (count > 0) {
            count--;
            System.out.println(this.getName() + ": " + count);
        }
    }
}
