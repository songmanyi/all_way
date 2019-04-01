package singleton.lazy;

public class LazyInnerClassSingleton {

    private LazyInnerClassSingleton() {
        // 判断是否为空->防止java反射创建对象
        if (SingletonHolder.singleton != null) {
            throw new RuntimeException("不可调用构造方法");
        }
    }

    public static final LazyInnerClassSingleton getInstance() {
        return SingletonHolder.singleton;
    }

    private static final class SingletonHolder {
        private static final LazyInnerClassSingleton singleton = new LazyInnerClassSingleton();
    }

}
