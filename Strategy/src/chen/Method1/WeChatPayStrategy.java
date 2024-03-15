package chen.Method1;

import chen.PaymentStrategy;

/**
 * 微信支付具体实现策略
 * @author chen
 * @date 2024年03月15日 11:22
 */
public class WeChatPayStrategy implements PaymentStrategy {
    @Override
    public void doPay() {
        System.out.println("微信支付");
    }
}
