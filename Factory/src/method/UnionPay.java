package method;

import simple.Payment;

/**
 * @author chen
 * @date 2024年03月29日 15:37
 */
public class UnionPay implements Payment {
    @Override
    public void pay() {
        System.out.println("银联支付");
    }
}
