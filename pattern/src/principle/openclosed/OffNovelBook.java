package principle.openclosed;

public class OffNovelBook extends NovelBook {

    public OffNovelBook(String name, int price) {
        super(name, price);
    }

    public int getPrice() {
        return (int) (super.getPrice() * 0.8);
    }
}
