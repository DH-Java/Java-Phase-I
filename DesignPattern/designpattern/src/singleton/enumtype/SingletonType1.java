package singleton.enumtype;

/**
 * Created with IntelliJ IDEA.
 * 枚举
 *
 * @Date: 2022/05/18/18:55
 * @Description:
 */
public class SingletonType1 {
    public static void main(String[] args) {
        //测试
        Singleton instance1 = Singleton.INSTANCE;
        Singleton instance2 = Singleton.INSTANCE;
        System.out.println(instance1 == instance2);
        System.out.println(instance1.hashCode());
        System.out.println(instance2.hashCode());
        instance1.say();
        instance2.say();
    }
}
enum Singleton{

    INSTANCE; //属性

    public void say(){
        System.out.println("Hello World");
    }
}
