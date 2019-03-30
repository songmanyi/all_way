package principle.interfacesegregation;

public class Dog implements IEatAnimal, ISwimAnimal {
    @Override
    public void eat() {
        System.out.println("狗在吃东西");
    }

    @Override
    public void swim() {
        System.out.println("狗在游泳");
    }
}
