package prototype.deep.serializable;

import java.io.IOException;
import java.util.Date;

public class SerializableCloneTest {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        Person p = new Person("p1", new Date());
        Home h1 = new Home("ID01", p);

        Client client = new Client();
        Home h2 = client.startClone(h1);

        System.out.println(h1 == h2);
        System.out.println(h2.getRoomId());
        System.out.println(h2.getPerson().getName());
        System.out.println(h2.getPerson().getBirthday() == p.getBirthday());

    }

}
