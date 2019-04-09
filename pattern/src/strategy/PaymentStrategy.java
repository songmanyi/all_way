package strategy;

import java.util.HashMap;
import java.util.Map;

public class PaymentStrategy {

    private static final String ALI_PAY = "aliPay";
    private static final String JD_PAY = "jdPay";
    private static final String DEFAULT_PAY = ALI_PAY;

    private static Map<String, Payment> paymentMap = new HashMap<>();

    static {
        paymentMap.put(ALI_PAY, new AliPayment());
        paymentMap.put(JD_PAY, new JdPayment());
    }

    public Payment get(String payKey) {
        if (paymentMap.containsKey(payKey)) {
            return paymentMap.get(payKey);
        }
        return paymentMap.get(DEFAULT_PAY);
    }

}
