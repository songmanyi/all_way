package prototype.deep.serializable;

import java.io.Serializable;

public class Home implements Serializable {

    private String roomId;
    private Person person;

    public Home(String roomId, Person person) {
        this.roomId = roomId;
        this.person = person;
    }

    public String getRoomId() {
        return roomId;
    }

    public void setRoomId(String roomId) {
        this.roomId = roomId;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }
}
