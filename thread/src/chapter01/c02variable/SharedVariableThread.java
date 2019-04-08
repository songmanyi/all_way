package chapter01.c02variable;

public class SharedVariableThread extends Thread {

    private MyData myData;

    public SharedVariableThread(String name, MyData myData) {
        super(name);
        this.myData = myData;
    }

    @Override
    public void run() {
        myData.count--;
        System.out.println(getName() + ": " + myData.count);
    }
}
