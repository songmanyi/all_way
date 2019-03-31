package singleton.register;

public enum EnumSingleton {

    INSTANCE;

    public static EnumSingleton getInstance() {
        return INSTANCE;
    }

    public void soutA() {
        System.out.println("A");
    }

}
