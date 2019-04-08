package delegate;

public class Employee implements IEmployee {

    private String name;

    public Employee(String name) {
        this.name = name;
    }

    @Override
    public void doing(String command) {
        System.out.println(name + " do " + command);
    }
}
