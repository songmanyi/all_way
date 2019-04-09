package strategy;

public class Order {

    private String uId;
    private String orderId;
    private double amount;

    public Order(String uId, String orderId, double amount) {
        this.uId = uId;
        this.orderId = orderId;
        this.amount = amount;
    }

    public MsgResult pay(String payKey) {
        PaymentStrategy strategy = new PaymentStrategy();
        return strategy.get(payKey).pay(uId, amount);
    }
}
