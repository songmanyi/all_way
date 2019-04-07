package proxy.staticproxy;

public class StaticProxyTest {

    public static void main(String[] args) {
        Subject subject = new Proxy(new RealSubject());
        subject.request();
    }

}
