package adapter;

public class DC5V implements IDC5V {

    private AC200V ac200V;

    public DC5V(AC200V ac200V) {
        this.ac200V = ac200V;
    }

    @Override
    public int outputDC() {
        int dc = ac200V.outputAC() / 44;
        System.out.println("直流电：" + dc + "V");
        return dc;
    }
}
