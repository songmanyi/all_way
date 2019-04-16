package prototype.deep.serializable;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SerializableCloneTest {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        Person p = new Person("p1", new Date());

        List<String> hobbies = new ArrayList<>();
        Home h1 = new Home("ID01", p, hobbies);

        Client client = new Client();
        Home h2 = client.startClone(h1);

        System.out.println(h1 == h2);
        System.out.println(h1.getHobbies() == h2.getHobbies());
        System.out.println(h2.getPerson().getBirthday() == p.getBirthday());

    }

}
