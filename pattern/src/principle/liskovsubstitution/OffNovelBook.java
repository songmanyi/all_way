package principle.liskovsubstitution;

public class OffNovelBook extends NovelBook {
    public OffNovelBook(String name, int price) {
        super(name, price);
    }

    public int getOffPrice() {
        return (int) (super.getPrice() * 0.85);
    }

}
