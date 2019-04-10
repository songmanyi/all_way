package templatemethod.course;

public class NetworkCourseTest {

    public static void main(String[] args) {
        NetworkCourse javaCourse = new JavaCourse();
        javaCourse.createCourse();

        NetworkCourse bigDataCourse = new BigDataCourse(false);
        bigDataCourse.createCourse();
    }

}
