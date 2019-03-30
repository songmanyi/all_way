package principle.dependenceinversion;

public class JavaCourse implements ICourse {
    @Override
    public void study() {
        System.out.println("学习Java课程");
    }
}
