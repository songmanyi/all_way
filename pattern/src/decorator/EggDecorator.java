package decorator;

public class EggDecorator extends BaseCake {

    private IBaseCake baseCake;

    public EggDecorator(IBaseCake baseCake) {
        this.baseCake = baseCake;
    }

    @Override
    public int getPrice() {
        return baseCake.getPrice() + 1;
    }

    @Override
    public String getMessage() {
        return baseCake.getMessage() + " 一个鸡蛋";
    }
}
