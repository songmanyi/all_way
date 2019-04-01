package singleton.register;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class EnumSingletonTest {

//    public static void main(String[] args) {
//        EnumSingleton singleton = EnumSingleton.getInstance();
//        singleton.soutA();
//    }

    // 反射测试
//    public static void main(String[] args) {
//
//        try {
//            Class<?> clazz = EnumSingleton.class;
//            Constructor constructor = clazz.getDeclaredConstructor();
//            constructor.setAccessible(true);
//            EnumSingleton obj = (EnumSingleton) constructor.newInstance();
//
//            // 单例创建的对象
//            EnumSingleton instance = EnumSingleton.getInstance();
//            System.out.println(instance == obj);
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }

    // 反序列化测试
    public static void main(String[] args) {
        EnumSingleton s1 = null;
        EnumSingleton s2 = EnumSingleton.getInstance();

        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream("EnumSingleton.obj");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(s2);

            FileInputStream fis = new FileInputStream("EnumSingleton.obj");
            ObjectInputStream ois = new ObjectInputStream(fis);
            s1 = (EnumSingleton) ois.readObject();

            System.out.println(s1 == s2);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
