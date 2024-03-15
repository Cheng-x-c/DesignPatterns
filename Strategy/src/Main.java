import chen.Method1.PaymentContext;
import chen.Method1.PaymentEnum;
import chen.Method2.PaymentStrategyEnum;
import chen.PaymentStrategy;

/**
 * @author chen
 * @date 2024年03月15日 11:08
 */
public class Main {
    public static void main(String[] args) {
        // 方法1
        PaymentContext paymentContext = new PaymentContext();
        paymentContext.getStrategy(PaymentEnum.ALI).doPay();

        // 方法2
        PaymentStrategy paymentStrategy = PaymentStrategyEnum.WECHAT;
        paymentStrategy.doPay();

    }
}