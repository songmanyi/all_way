package delegate;

public class Boss {

    public void task(Leader leader, String command) {
        leader.task(command);
    }

}
