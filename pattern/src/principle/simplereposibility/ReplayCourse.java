package principle.simplereposibility;

public class ReplayCourse implements ICourse {
    @Override
    public void study() {
        System.out.println("可以回放看");
    }
}
