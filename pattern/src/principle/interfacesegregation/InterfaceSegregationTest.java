package principle.interfacesegregation;

public class InterfaceSegregationTest {

    /*
    接口隔离原则：指用多个专用接口，而不使用单一的总接口，客户端不应该依赖它不需要的接口。
     */

    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat();
        dog.swim();

        Bird bird = new Bird();
        bird.eat();
        bird.fly();
    }

}
