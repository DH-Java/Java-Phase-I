package IO.src.reflect;

import java.lang.reflect.Constructor;

public class reflectTest12 {
    public static void main(String[] args) {
        try {
            //使用反射机制怎么创建对象
            Class<?> aClass = Class.forName("IO.src.reflect.User.Student");
            //调用无参构造方法
            Object o = aClass.newInstance();
            System.out.println(o);
            //调用有参的构造方法怎么办？
            //第一步，先获取到这个参数的构造方法
            Constructor declaredConstructor = aClass.getDeclaredConstructor(int.class, String.class, boolean.class, int.class);
            //调用构造方法new对象
            Object o1 = declaredConstructor.newInstance(19,"邓豪",true,20);
            System.out.println(o1);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
