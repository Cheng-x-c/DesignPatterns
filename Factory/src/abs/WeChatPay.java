package abs;

import simple.Payment;

/**
 * @author chen
 * @date 2024年03月29日 15:36
 */
public class WeChatPay implements Payment {
    @Override
    public void pay() {
        System.out.println("微信支付");
    }
}
