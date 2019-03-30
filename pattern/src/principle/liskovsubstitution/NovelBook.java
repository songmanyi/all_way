package principle.liskovsubstitution;

public class NovelBook implements IBook {

    private String name;

    private int price;

    public NovelBook(String name, int price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public int getPrice() {
        return this.price;
    }
}
