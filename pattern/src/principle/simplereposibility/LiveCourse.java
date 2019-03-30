package principle.simplereposibility;

public class LiveCourse implements ICourse {
    @Override
    public void study() {
        System.out.println("不能快进");
    }
}
