package adapter;

public class AC200V {

    private int ac = 220;

    public int outputAC() {
        System.out.println("交流电：" + ac + "V");
        return ac;
    }

}
