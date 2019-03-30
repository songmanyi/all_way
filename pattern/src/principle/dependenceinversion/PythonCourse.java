package principle.dependenceinversion;

public class PythonCourse implements ICourse {
    @Override
    public void study() {
        System.out.println("学习Python课程");
    }
}
