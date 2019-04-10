package adapter;

public class AdaperTest {

    public static void main(String[] args) {
        IDC5V dc = new DC5V(new AC200V());
        dc.outputDC();
    }

}
