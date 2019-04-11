package observer.jdkwechat;

import java.util.Observable;
import java.util.Observer;

public class User implements Observer {

    private String name;

    public User(String name) {
        this.name = name;
    }

    @Override
    public void update(Observable o, Object arg) {
        String message = (String) arg;
        System.out.println(this.name + "->" + message);

    }
}
