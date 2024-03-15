package chen.Method2;

import chen.PaymentStrategy;

/**
 * 支付枚举具体实现策略类
 * @author chen
 * @date 2024年03月15日 11:46
 */
public enum PaymentStrategyEnum implements PaymentStrategy {

    ALI(){
        @Override
        public void doPay() {
            System.out.println("支付宝枚举支付");
        }
    },
    WECHAT(){
        @Override
        public void doPay() {
            System.out.println("微信枚举支付");
        }
    },
    UNION(){
        @Override
        public void doPay() {
            System.out.println("银联枚举支付");
        }
    }
}
