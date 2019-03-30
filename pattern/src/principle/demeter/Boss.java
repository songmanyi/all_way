package principle.demeter;

public class Boss {

    public void commandCourseNum(TeamLeader teamLeader) {
        teamLeader.checkCourseNum();
    }

}
