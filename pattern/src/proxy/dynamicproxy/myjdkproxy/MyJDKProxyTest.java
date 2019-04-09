package proxy.dynamicproxy.myjdkproxy;

public class MyJDKProxyTest {

    public static void main(String[] args) {
        try {
            Person person = (Person) new MyMeipo().getInstance(new Girl());
            person.findLove();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
