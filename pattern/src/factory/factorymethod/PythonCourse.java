package factory.factorymethod;

public class PythonCourse implements ICourse {
    @Override
    public void record() {
        System.out.println("Python Course record");
    }
}
