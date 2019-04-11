package observer.wechat;

public class ObserverTest {

    public static void main(String[] args) {
        IObservable observable = new WechatObservable();

        IObserver u1 = new User("张三");
        IObserver u2 = new User("李四");
        IObserver u3 = new User("王五");

        observable.addObserver(u1);
        observable.addObserver(u2);
        observable.addObserver(u3);
        observable.notify("您终奖了。");
        System.out.println("==========================");
        observable.removeObserver(u3);
        observable.notify("请从淘宝领取");


    }

}
