package principle.demeter;

public class DemeterTest {

    /*
    迪米特法则（最少知道原则）：尽量降低类与类之间的耦合度
     */

    public static void main(String[] args) {
        TeamLeader teamLeader = new TeamLeader();

        Boss boss = new Boss();
        boss.commandCourseNum(teamLeader);
    }

}
