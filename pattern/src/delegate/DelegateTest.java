package delegate;

public class DelegateTest {

    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.task(new Leader(), "测试");
    }

}
