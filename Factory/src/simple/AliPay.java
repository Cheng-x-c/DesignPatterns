package simple;

/**
 * @author chen
 * @date 2024年03月29日 15:36
 */
public class AliPay implements Payment{
    @Override
    public void pay() {
        System.out.println("支付宝");
    }
}
