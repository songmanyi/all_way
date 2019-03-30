package principle.dependenceinversion;

public class Person {

    private ICourse course = null;

    void study() {
        if (course != null) {
            course.study();
        }
    }

    public void setCourse(ICourse course) {
        this.course = course;
    }

}
