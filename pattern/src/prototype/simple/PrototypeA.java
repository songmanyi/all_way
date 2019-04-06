package prototype.simple;

import java.util.List;

public class PrototypeA implements Prototype {

    private String name;
    private int age;
    private List<String> hobbies;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<String> getHobbies() {
        return hobbies;
    }

    public void setHobbies(List<String> hobbies) {
        this.hobbies = hobbies;
    }

    @Override
    public PrototypeA clone() {
        PrototypeA a = new PrototypeA();
        a.setAge(this.age);
        a.setName(this.name);
        a.setHobbies(this.hobbies);
        return a;
    }

}
