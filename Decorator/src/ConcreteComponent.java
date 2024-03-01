/**
 * 具体构件角色：定义一个将要接收附加责任的类。 <br/>
 * 抽象构件{@link Component}的具体实现，可实例化使用未被增强前的方法，也可以通过装饰角色为其添加一些职责（增强）。
 *
 * @author chen
 * @date 2024年03月01日 11:19
 */
public class ConcreteComponent implements Component {
    @Override
    public void operation() {
        System.out.println("具体业务逻辑");
    }
}
