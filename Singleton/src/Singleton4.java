/**
 * 静态内部类（推荐）
 * 它利用了静态内部类只会在被使用时才会加载（初始化），而jvm在类加载的时候是线程安全的，即使在多线程的环境下，也只有一个线程去加载这个类。
 * 从而避免了饿汉式单例的资源浪费和懒汉式单例的线程不安全问题。
 *
 * @author chen
 * @date 2024年03月06日 10:44
 */
public class Singleton4 {

    /**
     * 静态内部类，只有在被使用的时候才会初始化，且只有初始化一次，线程安全
     */
    private static class Singleton4Holder {
        // 在静态内部类初始化的时候去创建实例，避免了资源浪费，线程安全
        private static final Singleton4 instance = new Singleton4();
    }

    private Singleton4() {
    }

    public static Singleton4 getInstance() {
        return Singleton4Holder.instance;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 1000; i++) {
            Thread thread = new Thread(() -> System.out.println(Singleton4.getInstance()));
            thread.start();
        }
    }

}
