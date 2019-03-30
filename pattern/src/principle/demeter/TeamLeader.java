package principle.demeter;

import java.util.ArrayList;
import java.util.List;

public class TeamLeader {

    public void checkCourseNum() {
        List<Course> courses = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            courses.add(new Course());
        }
        System.out.println("Course count: " + courses.size());
    }

}
