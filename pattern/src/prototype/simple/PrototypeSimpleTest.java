package prototype.simple;

import java.util.ArrayList;

public class PrototypeSimpleTest {

    public static void main(String[] args) {

        Client client = new Client();

        PrototypeA a = new PrototypeA();
        a.setAge(15);
        a.setName("Mr.Song");
        a.setHobbies(new ArrayList<String>() {
            {
                add("One");
                add("Two");
            }
        });

        // 克隆
        PrototypeA b = (PrototypeA) client.startClone(a);
        System.out.println(b.getName());
        System.out.println(b.getAge());
        System.out.println(b.getHobbies());

        System.out.println(a.getHobbies() == b.getHobbies());

    }

}
