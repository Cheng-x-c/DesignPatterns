package abs;

/**
 * 抽象工厂模式是工厂方法的进一步深化，在这个模式中的工厂类不单单可以创建一个对象，而是可以创建一组对象。这是和工厂方法最大的不同点。
 * 抽象工厂模式：
 * 定义：提供一个创建一系列相关或相互依赖对象的接口，而无须指定它们具体的类。（ 在抽象工厂模式中，每一个具体工厂都提供了多个工厂方法用于产生多种不同类型的对象）
 * 适用场景：对象相互依赖且有共同属性
 *
 * @author chen
 * @date 2024年04月01日 10:34
 */
public class Main {


    public static void main(String[] args) {
        PaymentFactory paymentFactory;
        paymentFactory = new AliPayFactory();
        paymentFactory.getCompany().showCompanyName();
        paymentFactory.getPayment().pay();
        paymentFactory = new WeChatPayFactory();
        paymentFactory.getCompany().showCompanyName();
        paymentFactory.getPayment().pay();
        paymentFactory = new UnionPayFactory();
        paymentFactory.getCompany().showCompanyName();
        paymentFactory.getPayment().pay();

    }


}
