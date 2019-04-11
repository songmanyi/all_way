package decorator;

public class BaseCake implements IBaseCake {

    @Override
    public int getPrice() {
        return 5;
    }

    @Override
    public String getMessage() {
        return "一个煎饼";
    }
}
