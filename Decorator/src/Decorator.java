/**
 * 抽象装饰角色：继承或实现抽象构件，聚合抽象构件，通过子类扩展具体构件的功能。 <br/>
 * 实现抽象构件{@link  Component} <br>
 *
 * @author chen
 * @date 2024年03月01日 11:23
 */
public abstract class Decorator implements Component {

    Component component;

    public Decorator(Component component) {
        this.component = component;
    }

    @Override
    public void operation() {
        //委派给构件
        component.operation();
    }
}
