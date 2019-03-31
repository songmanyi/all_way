package singleton.lazy;

public class LazyInnerClassSingleton {

    private LazyInnerClassSingleton() {
        System.out.println("调用构造方法");
    }

    public static final LazyInnerClassSingleton getInstance() {
        return SingletonHolder.singleton;
    }

    private static final class SingletonHolder {
        private static final LazyInnerClassSingleton singleton = new LazyInnerClassSingleton();
    }

}
