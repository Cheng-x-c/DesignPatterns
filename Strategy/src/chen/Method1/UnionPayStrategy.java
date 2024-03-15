package chen.Method1;

import chen.PaymentStrategy;

/**
 * 银联支付具体实现策略
 * @author chen
 * @date 2024年03月15日 11:22
 */
public class UnionPayStrategy implements PaymentStrategy {
    @Override
    public void doPay() {
        System.out.println("银联支付");
    }
}
