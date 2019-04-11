package observer.jdkwechat;

import java.util.Observable;

public class WechatObservable extends Observable {

    public void notify(String message) {
        setChanged();
        notifyObservers(message);
    }

}
