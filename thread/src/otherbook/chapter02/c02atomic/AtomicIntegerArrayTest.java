package otherbook.chapter02.c02atomic;

import java.util.concurrent.atomic.AtomicIntegerArray;

public class AtomicIntegerArrayTest {

    public static void main(String[] args) {

        int[] value = new int[] {1,2,3};
        AtomicIntegerArray aia = new AtomicIntegerArray(value);
        aia.getAndSet(0, 3);
        aia.getAndAdd(0, 1);
        System.out.println(aia.get(0));
        System.out.println(value[0]);

    }

}
