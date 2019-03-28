package factory.abstractfactory;

public class AbstractFactoryTest {

    public static void main(String[] args) {
        ICourseFactory javaFactory = new JavaFactory();
        ICourse javaCourse = javaFactory.createCourse();
        javaCourse.course();

        INote javaNote = javaFactory.createNote();
        javaNote.note();

        IVedio javaVedio = javaFactory.createVedio();
        javaVedio.vedio();
    }

}
