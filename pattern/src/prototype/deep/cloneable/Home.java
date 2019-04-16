package prototype.deep.cloneable;

import java.util.ArrayList;
import java.util.List;

public class Home implements Cloneable {

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

    @Override
    protected Home clone() throws CloneNotSupportedException {
        // 浅克隆：未克隆home的成员
//         return (Home) super.clone();

        // 深克隆
        Home home = null;
        try {
            home = (Home) super.clone();
            home.hobbies = (List<String>) ((ArrayList<String>)home.hobbies).clone();
            home.person = home.person.clone();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return home;
    }
}
