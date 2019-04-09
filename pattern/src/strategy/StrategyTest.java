package strategy;

public class StrategyTest {

    public static void main(String[] args) {
        Order order = new Order("UID0001", "OID00001", 256.5);
        MsgResult msgResult = order.pay("jdPay");
        System.out.println(msgResult);
    }

}
