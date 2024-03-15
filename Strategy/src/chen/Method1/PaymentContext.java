package chen.Method1;

import chen.PaymentStrategy;

import java.util.HashMap;
import java.util.Map;

/**
 * 支付上下文，用于调用具体策略的方法，可以根据需要切换
 * @author chen
 * @date 2024年03月15日 11:25
 */
public class PaymentContext {

    private Map<PaymentEnum, PaymentStrategy> paymentStrategyMap = new HashMap<>();

    public PaymentContext() {
        paymentStrategyMap.put(PaymentEnum.ALI, new AliPayStrategy());
        paymentStrategyMap.put(PaymentEnum.WECHAT, new WeChatPayStrategy());
        paymentStrategyMap.put(PaymentEnum.UNION, new UnionPayStrategy());
    }

    public PaymentStrategy getStrategy(PaymentEnum paymentEnum) {
        return paymentStrategyMap.get(paymentEnum);
    }
}
