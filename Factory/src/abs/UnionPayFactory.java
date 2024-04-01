package abs;

import simple.Payment;
import simple.UnionPay;

/**
 * @author chen
 * @date 2024年03月29日 15:37
 */
public class UnionPayFactory implements PaymentFactory {

    @Override
    public Payment getPayment() {
        return new UnionPay();
    }

    @Override
    public Company getCompany() {
        return new BankCompany();
    }
}
