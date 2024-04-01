package simple;

/**
 * @author chen
 * @date 2024年03月29日 15:38
 */
public class PaymentFactory {

    public static Payment getPayment(PaymentType paymentType) {
        if (PaymentType.WECHAT == paymentType) {
            return new WeChatPay();
        } else if (PaymentType.ALI == paymentType) {
            return new AliPay();
        } else if (PaymentType.UNION == paymentType) {
            return new UnionPay();
        } else {
            return null;
        }
    }

}
