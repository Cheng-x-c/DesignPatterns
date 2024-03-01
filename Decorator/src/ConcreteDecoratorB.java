/**
 * 具体装饰角色
 *
 * @author chen
 * @date 2024年03月01日 11:27
 */
public class ConcreteDecoratorB extends Decorator {

    public ConcreteDecoratorB(Component component) {
        super(component);
    }

    @Override
    public void operation() {
        super.operation();
        System.out.println("逻辑增强B");
        // 业务逻辑
    }


}
