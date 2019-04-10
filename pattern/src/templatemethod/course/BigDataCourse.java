package templatemethod.course;

public class BigDataCourse extends NetworkCourse {

    private boolean needHomeworkFlag = false;

    public BigDataCourse(boolean needHomeworkFlag) {
        this.needHomeworkFlag = needHomeworkFlag;
    }

    @Override
    protected void checkHomeWork() {
        System.out.println("大数据的课后作业");
    }

    @Override
    protected boolean neddHomeWork() {
        return this.needHomeworkFlag;
    }
}
