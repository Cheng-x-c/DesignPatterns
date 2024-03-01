/**
 * @author chen
 * @date 2024年03月01日 11:14
 */
public class Main {

    public static void main(String[] args) {
        //没有经过修饰，直接使用具体构件
        /*ConcreteComponent concreteComponent = new ConcreteComponent();
        concreteComponent.operation();*/
        Component component = new ConcreteComponent();
        Component decoratorA = new ConcreteDecoratorA(component);
        decoratorA.operation();
    }

}