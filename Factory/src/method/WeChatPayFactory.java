package method;

import simple.Payment;
import simple.WeChatPay;

/**
 * @author chen
 * @date 2024年03月29日 15:36
 */
public class WeChatPayFactory implements PaymentFactory {
    @Override
    public Payment getPayment() {
        return new WeChatPay();
    }
}
