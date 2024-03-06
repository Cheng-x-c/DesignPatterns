/**
 * 双重检验锁 <br/>
 * 由懒汉式优化而来，解决了懒汉式的线程安全问题，主要是通过volatile保证其可见性，然后创建时通过synchronized保证原子操作
 *
 * @author chen
 * @date 2024年03月06日 09:43
 */
public class Singleton3 {
    private volatile static Singleton3 instance;

    private Singleton3() {
    }

    public static Singleton3 getInstance() {
        //首先检查实例是否存在
        if (instance == null) {
            //再次检查实例是否存在，但是要使用synchronized关键字保证原子操作
            synchronized (Singleton3.class) {
                if (instance == null) {
                    instance = new Singleton3();
                }
            }
        }
        return instance;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 1000; i++) {
            Thread thread = new Thread(()-> System.out.println(Singleton3.getInstance()));
            thread.start();
        }
    }


}
