package decorator;

public class HamDecorator implements IBaseCake {

    private IBaseCake baseCake;

    public HamDecorator(IBaseCake baseCake) {
        this.baseCake = baseCake;
    }

    @Override
    public int getPrice() {
        return baseCake.getPrice() + 2;
    }

    @Override
    public String getMessage() {
        return baseCake.getMessage() + " 一个火腿";
    }
}
