package singleton.staticinternalclass;

/**
 * Created with IntelliJ IDEA.
 * 静态内部类
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
 * @Description: 静态内部类
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

    //写一个静态内部类，该类中有一个静态属性Singleton
    private static class SingletonInstance {
        private static final Singleton INSTANCE = new Singleton();
    }


    //3、提供一个公有的静态方法,直接返回SingletonInstance.INSTANCE
    public static Singleton getInstance() {
        return SingletonInstance.INSTANCE;
    }
}
