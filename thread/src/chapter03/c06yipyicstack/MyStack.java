package chapter03.c06yipyicstack;

import java.util.ArrayList;
import java.util.List;

public class MyStack {

    private List list = new ArrayList();

    synchronized public void push() {
        try {
            while (list.size() == 1) {
                this.wait();
            }
            list.add("anything");
            this.notifyAll();
            System.out.println("push=" + list.size());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    synchronized public void pop() {

        try {
            while (list.size() == 0) {
                System.out.println("pop操作中的线程" + Thread.currentThread().getName() + "呈现wait状态");
                this.wait();
            }
            list.remove(0);
            this.notifyAll();
            System.out.println(Thread.currentThread().getName() +" pop list.size=" + list.size());
        } catch (Exception e) {
            e.printStackTrace();
        }

    }


}
