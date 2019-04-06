package prototype.deep.cloneable;

public class Home implements Cloneable {

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

    @Override
    protected Home clone() throws CloneNotSupportedException {
        // 浅克隆：未克隆home的成员
         return (Home) super.clone();

        // 深克隆
//        Home home = null;
//        try {
//            home = (Home) super.clone();
//            home.person = home.person.clone();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        return home;
    }
}
