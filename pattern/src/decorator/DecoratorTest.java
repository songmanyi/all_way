package decorator;

public class DecoratorTest {

    public static void main(String[] args) {
        IBaseCake cake = new BaseCake();
        // 加两个鸡蛋
        cake = new EggDecorator(cake);
        cake = new EggDecorator(cake);
        // 加一个火腿
        cake = new HamDecorator(cake);

        // 输出信息
        System.out.println(cake.getMessage());
        System.out.println(cake.getPrice());
    }

}
