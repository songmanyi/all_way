package prototype.deep.cloneable;

import java.util.ArrayList;
import java.util.List;

public class HomeTest {

    public static void main(String[] args) {

        Person p1 = new Person("p1");

        List<String> hobbies = new ArrayList<>();
        Home h1 = new Home("id01", p1, hobbies);

        try {
            Home h2 = h1.clone();
            System.out.println(h1 == h2);
            System.out.println(h1.getHobbies() == h2.getHobbies());
            System.out.println(h2.getPerson() == h1.getPerson());
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }

}
