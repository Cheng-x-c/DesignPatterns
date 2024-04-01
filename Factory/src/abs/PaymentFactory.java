package abs;

import simple.Payment;

/**
 * 支付抽象接口
 *
 * @author chen
 * @date 2024年03月29日 15:34
 */
public interface PaymentFactory {

    Payment getPayment();

    Company getCompany();

}
