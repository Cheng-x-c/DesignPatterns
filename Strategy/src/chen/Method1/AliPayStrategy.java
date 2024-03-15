package chen.Method1;

import chen.PaymentStrategy;

    /**
     * 支付宝支付具体实现策略
     * @author chen
     * @date 2024年03月15日 11:22
     */
    public class AliPayStrategy implements PaymentStrategy {
        @Override
        public void doPay() {
            System.out.println("支付宝支付");
        }
    }
