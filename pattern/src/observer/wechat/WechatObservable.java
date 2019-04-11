package observer.wechat;

import java.util.ArrayList;
import java.util.List;

public class WechatObservable implements IObservable {

    private List<IObserver> observers;

    public WechatObservable() {
        this.observers = new ArrayList<>();
    }

    @Override
    public void addObserver(IObserver observer) {
        if (!observers.contains(observer)) {
            observers.add(observer);
        }
    }

    @Override
    public void removeObserver(IObserver observer) {
        if (observers.contains(observer)) {
            observers.remove(observer);
        }
    }

    @Override
    public void notify(String message) {
        observers.stream().forEach(observer -> {
            observer.update(message);
        });
    }
}
