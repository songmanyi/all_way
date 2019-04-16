package prototype.deep.serializable;

import java.io.Serializable;
import java.util.List;

public class Home implements Serializable {

    private String roomId;
    private Person person;
    private List<String> hobbies;

    public Home(String roomId, Person person, List<String> hobbies) {
        this.roomId = roomId;
        this.person = person;
        this.hobbies = hobbies;
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

    public List<String> getHobbies() {
        return hobbies;
    }

    public void setHobbies(List<String> hobbies) {
        this.hobbies = hobbies;
    }
}
