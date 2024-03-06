/**
 * 懒汉式创建 <br/>
 * 在第一次访问的时候才创建，线程不安全，可以用synchronized关键字解决，但是效率极低
 *
 * @author chen
 * @date 2024年03月05日 16:40
 */
public class Singleton1 {
    //静态实例
    private static Singleton1 singleton1;

    // 私有构造方法
    private Singleton1() {
    }

    /**
     * 不加synchronized关键字修饰，线程不安全，效率高
     */
    private static Singleton1 getInstance() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        if (singleton1 == null) {
            singleton1 = new Singleton1();
        }
        return singleton1;
    }

    /**
     * 加synchronized关键字修饰，线程安全，效率低
     */
    private static synchronized Singleton1 getInstance2() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        if (singleton1 == null) {
            singleton1 = new Singleton1();
        }
        return singleton1;
    }

    public static void main(String[] args) {
        // 多线程情况下有线程安全问题,多执行几次，会发现可能会出现对象地址不一致的情况，这代表有两个Singleton1对象，就不再是单例模式了
        for (int i = 0; i < 1000; i++) {
            Thread thread = new Thread(() -> System.out.println(Singleton1.getInstance()));
            thread.start();
        }

        // 加了synchronized的情况下再执行，会发现每次都是指向同一个地址，但是执行效率非常低，串行执行
        /*for (int i = 0; i < 1000; i++) {
            Thread thread = new Thread(() -> System.out.println(Singleton1.getInstance2()));
            thread.start();
        }*/
    }

}
