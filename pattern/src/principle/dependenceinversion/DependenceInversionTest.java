package principle.dependenceinversion;

public class DependenceInversionTest {

    /*
    依赖倒置原则：高层模块不依赖于底层模块，应当依赖其抽象。抽象不依赖于细节，细节依赖于抽象。

    如依赖注入，典型的依赖倒置原则
     */

    public static void main(String[] args) {

        Person p = new Person();
        p.setCourse(new JavaCourse());
        p.study();

        p.setCourse(new PythonCourse());
        p.study();
    }

}
