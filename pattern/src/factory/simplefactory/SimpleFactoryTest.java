package factory.simplefactory;

public class SimpleFactoryTest {

    public static void main(String[] args) {

        ICourseFactory factory = new CourseFactory();
        ICourse javaCourse = factory.create(JavaCourse.class);
        javaCourse.record();

        ICourse pythonCourse = factory.create(PythonCource.class);
        pythonCourse.record();
    }

}
