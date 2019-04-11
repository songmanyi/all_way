package observer.jdkwechat;

public class JdkWechatTest {

    public static void main(String[] args) {
        WechatObservable wechatObservable = new WechatObservable();
        User u1 = new User("张三");
        User u2 = new User("李四");

        wechatObservable.addObserver(u1);
        wechatObservable.addObserver(u2);
        wechatObservable.notify("你好");
    }

}
