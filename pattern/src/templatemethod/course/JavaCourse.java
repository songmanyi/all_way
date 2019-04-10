package templatemethod.course;

public class JavaCourse extends NetworkCourse {

    @Override
    protected boolean neddHomeWork() {
        return true;
    }

    @Override
    protected void checkHomeWork() {
        System.out.println("检查Java作业");
    }
}
