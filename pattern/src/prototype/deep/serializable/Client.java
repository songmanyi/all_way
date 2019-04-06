package prototype.deep.serializable;

import java.io.*;

public class Client {

    public Home startClone(Home home) throws IOException, ClassNotFoundException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream((baos));
        oos.writeObject(home);

        ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bais);

        return (Home) ois.readObject();
    }

}
