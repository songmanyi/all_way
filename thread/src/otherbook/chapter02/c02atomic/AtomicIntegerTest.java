package otherbook.chapter02.c02atomic;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicIntegerTest {

    public static void main(String[] args) {

        AtomicInteger ai = new AtomicInteger(1);

        ai.getAndAdd(12);
        System.out.println(ai.get());

    }

}
