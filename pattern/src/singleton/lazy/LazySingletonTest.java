package singleton.lazy;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.TimeUnit;

public class LazySingletonTest {

    // 线程安全与否测试
    /*
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new Thread(()->{
                // 性能最优的方案
                LazyInnerClassSingleton.getInstance();
            }).start();
        }

        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("end");

    }
    */

    // 反射测试
//    public static void main(String[] args) {
//
//
//        try {
//            Class<?> clazz = LazyInnerClassSingleton.class;
//            Constructor constructor = clazz.getDeclaredConstructor();
//            constructor.setAccessible(true);
//            LazyInnerClassSingleton obj = (LazyInnerClassSingleton) constructor.newInstance();
//
//            // 单例创建的对象
//            LazyInnerClassSingleton instance = LazyInnerClassSingleton.getInstance();
//            System.out.println(instance == obj);
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//
//    }

    // 反序列化测试
    public static void main(String[] args) {
        LazyInnerClassSingleton s1 = null;
        LazyInnerClassSingleton s2 = LazyInnerClassSingleton.getInstance();

        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream("LazyInnerClassSingleton.obj");
            ObjectOutputStream  oos = new ObjectOutputStream(fos);
            oos.writeObject(s2);

            FileInputStream fis = new FileInputStream("LazyInnerClassSingleton.obj");
            ObjectInputStream ois = new ObjectInputStream(fis);
            s1 = (LazyInnerClassSingleton) ois.readObject();

            System.out.println(s1 == s2);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
