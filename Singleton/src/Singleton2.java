/**
 * 饿汉式创建 <br/>
 * 通过静态代码块的方式，在类加载的时候就创建，不存在线程安全问题
 *
 * @author chen
 * @date 2024年03月06日 09:29
 */
public class Singleton2 {

    private static final Singleton2 INSTANCE = new Singleton2();

    private Singleton2() {
    }

    public static Singleton2 getInstance() {
        return INSTANCE;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 1000; i++) {
            Thread thread = new Thread(() -> System.out.println(Singleton2.getInstance()));
            thread.start();
        }
    }

}
