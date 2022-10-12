package singleton.doubleinspection;

/**
 * Created with IntelliJ IDEA.
 * 双重检查
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
 * @Description: 双重检查
 * @Param:
 * @return:
 * @Date: 2022/5/18
 */
class Singleton {

    //1、构造器私有化，外部不能new
    private Singleton() {

    }

    //2、本类内部创建对象实例
    private static volatile Singleton instance;

    //3、提供一个公有的静态方法，加入双重检查代码，解决线程安全问题，同时解决懒加载问题
    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}
