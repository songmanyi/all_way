package decorator;

public class HamDecorator extends BaseCakeDecorator {

    public HamDecorator(IBaseCake baseCake) {
        super(baseCake);
    }

    @Override
    public int getPrice() {
        return super.getPrice() + 2;
    }

    @Override
    public String getMessage() {
        return super.getMessage() + " 一个火腿";
    }
}
