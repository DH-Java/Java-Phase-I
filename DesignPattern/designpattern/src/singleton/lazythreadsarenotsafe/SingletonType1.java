package singleton.lazythreadsarenotsafe;

/**
 * Created with IntelliJ IDEA.
 * 懒汉式（线程不安全）
 *
 * @Date: 2022/05/18/18:55
 * @Description:
 */
public class SingletonType1 {
    public static void main(String[] args) {
        //测试
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        System.out.println(instance1 == instance2);
        System.out.println(instance1.hashCode());
        System.out.println(instance2.hashCode());
    }
}

/**
 * @Description: 懒汉式（线程不安全）
 * @Param:
 * @return:
 * @Date: 2022/5/18
 */
class Singleton {

    //1、构造器私有化，外部不能new
    private Singleton() {

    }

    //2、本类内部创建对象实例
    private static Singleton instance;


    //3、提供一个公有的静态方法，当使用到该方法，才会去创建instance
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
