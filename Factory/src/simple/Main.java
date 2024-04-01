package simple;

/**
 * 简单工厂模式：定义一个工厂类，根据传入的参数不同返回不同的实例，被创建的实例具有共同的父类或接口。
 * 适用场景：1）需要创建的对象较少（太多了代码量大）；2）客户端不关心对象的创建过程。
 *
 * @author chen
 * @date 2024年03月29日 10:19
 */
public class Main {

    public static void main(String[] args) {
        Payment payment = PaymentFactory.getPayment(PaymentType.WECHAT);
        payment.pay();
        Payment payment1 = PaymentFactory.getPayment(PaymentType.ALI);
        payment1.pay();
        Payment payment2 = PaymentFactory.getPayment(PaymentType.UNION);
        payment2.pay();

    }
}