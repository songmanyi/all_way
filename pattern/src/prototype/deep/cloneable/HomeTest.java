package prototype.deep.cloneable;

public class HomeTest {

    public static void main(String[] args) {
        Person p1 = new Person("p1");
        Home h1 = new Home("id01", p1);

        try {
            Home h2 = h1.clone();
            System.out.println(h1 == h2);
            System.out.println(h2.getPerson() == h1.getPerson());
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }

}
