package abs;

import simple.Payment;

/**
 * @author chen
 * @date 2024年03月29日 15:36
 */
public class AliPayFactory implements PaymentFactory {
    @Override
    public Payment getPayment() {
        return new AliPay();
    }

    @Override
    public Company getCompany() {
        return new AliCompany();
    }
}
