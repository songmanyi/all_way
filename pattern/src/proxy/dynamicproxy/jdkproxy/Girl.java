package proxy.dynamicproxy.jdkproxy;

public class Girl implements Person {
    @Override
    public void findLove() {
        System.out.println("girl's request.");
    }

    @Override
    public void findOther() {
        System.out.println("find other.");
    }
}
