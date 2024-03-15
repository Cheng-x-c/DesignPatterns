package chen;

/**
 * 支付抽象策略接口（对扩展开放）
 *
 * @author chen
 * @date 2024年03月15日 11:17
 */
public interface PaymentStrategy {

    /**
     * 支付抽象方法
     */
    void doPay();
}
