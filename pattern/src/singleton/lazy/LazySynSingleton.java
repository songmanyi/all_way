package singleton.lazy;

public class LazySynSingleton {

    private static LazySynSingleton singleton;

    private LazySynSingleton() {}

    public synchronized static LazySynSingleton getInstance() {
        if (singleton != null) {
            singleton = new LazySynSingleton();
        }
        return singleton;
    }

}
