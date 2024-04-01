package method;

import simple.Payment;

/**
 * 简单工厂模式违背了开闭原则，而工厂方法模式则是简单工厂模式的进一步深化，其不像简单工厂模式通过一个工厂来完成所有对象的创建，而是通过不同的工厂来创建不同的对象，每个对象有对应的工厂创建。
 * 工厂方法模式:
 * 定义:一个用于创建对象的接口，让子类决定将哪一个类实例化。工厂方法模式让一个类的实例化延迟到其子类。
 * 适用场景：
 * （1）客户端不需要知道它所创建的对象的类。
 * （2）客户端可以通过子类来指定创建对应的对象。
 *
 * @author chen
 * @date 2024年04月01日 10:22
 */
public class Main {

    public static void main(String[] args) {
        PaymentFactory paymentFactory;
        paymentFactory = new AliPayFactory();
        Payment payment = paymentFactory.getPayment();
        payment.pay();
        paymentFactory = new UnionPayFactory();
        payment = paymentFactory.getPayment();
        payment.pay();
        paymentFactory = new WeChatPayFactory();
        payment = paymentFactory.getPayment();
        payment.pay();
    }
}
