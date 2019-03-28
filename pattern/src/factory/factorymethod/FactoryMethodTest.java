package factory.factorymethod;

public class FactoryMethodTest {

    public static void main(String[] args) {
        ICourseFactory javaFactory = new JavaFactory();
        ICourse javaCourse = javaFactory.create();
        javaCourse.record();

        ICourseFactory pythonFactory = new PythonFactory();
        ICourse pythonCourse = pythonFactory.create();
        pythonCourse.record();
    }

}
