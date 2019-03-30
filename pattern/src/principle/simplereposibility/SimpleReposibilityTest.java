package principle.simplereposibility;

public class SimpleReposibilityTest {

    /*
    单一职责：是指不要存在多余一个导致类变更的原因。

    假设，一个Class负责两个指责，一旦发生需求变更，
    修改其中一个职责的逻辑代码时，有可能导致另外一个职责的逻辑发生故障。
     */

    public static void main(String[] args) {

        ICourse liveCourse = new LiveCourse();
        liveCourse.study();

        ICourse replayCourse = new ReplayCourse();
        replayCourse.study();

    }

}
