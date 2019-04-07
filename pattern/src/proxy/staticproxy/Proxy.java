package proxy.staticproxy;

public class Proxy implements Subject {

    private Subject subject;

    public Proxy(Subject subject) {
        this.subject = subject;
    }

    @Override
    public void request() {
        before();
        subject.request();
        after();
    }

    private void before() {
        System.out.println("before request");
    }

    private void after() {
        System.out.println("after request");
    }
}
