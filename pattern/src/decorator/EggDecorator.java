package decorator;

public class EggDecorator extends BaseCakeDecorator {

    public EggDecorator(IBaseCake baseCake) {
        super(baseCake);
    }

    @Override
    public int getPrice() {
        return super.getPrice() + 1;
    }

    @Override
    public String getMessage() {
        return super.getMessage() + " 一个鸡蛋";
    }
}
