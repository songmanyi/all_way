package principle.interfacesegregation;

public class Bird implements IFlyAnimal, IEatAnimal {
    @Override
    public void eat() {
        System.out.println("鸟在吃东西");
    }

    @Override
    public void fly() {
        System.out.println("鸟在飞");
    }
}
