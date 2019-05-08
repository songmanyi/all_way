package integerswap;

import java.lang.reflect.Field;

public class IntegerSwapTest {

    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {

        Integer a = 1;
        Integer b = 2;
        System.out.println("a=" + a + " b=" + b);
        swap(a, b);
        System.out.println("a=" + a + " b=" + b);
    }

    private static void swap(Integer a, Integer b) throws NoSuchFieldException, IllegalAccessException {
        Field field = Integer.class.getDeclaredField("value");
        field.setAccessible(true);
        Integer tmp = new Integer(a.intValue());
        field.set(a, b.intValue());
        field.set(b, tmp);
    }

}
