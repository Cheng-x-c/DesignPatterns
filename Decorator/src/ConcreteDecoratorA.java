/**
 * 具体装饰角色：继承或实现抽象装饰的相关方法，扩展具体构件的职责（增强）。<br/>
 * 继承{@link Decorator}抽象装饰类并进行扩展（增强）。
 *
 *
 * @author chen
 * @date 2024年03月01日 11:27
 */
public class ConcreteDecoratorA extends Decorator {

    public ConcreteDecoratorA(Component component) {
        super(component);
    }

    @Override
    public void operation() {
        super.operation();
        System.out.println("逻辑增强A");
        // 业务逻辑
    }


}
