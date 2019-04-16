package decorator;

public class BaseCakeDecorator implements IBaseCake {

    private IBaseCake baseCake;

    public BaseCakeDecorator(IBaseCake baseCake) {
        this.baseCake = baseCake;
    }

    @Override
    public int getPrice() {
        return this.baseCake.getPrice();
    }

    @Override
    public String getMessage() {
        return this.baseCake.getMessage();
    }
}
