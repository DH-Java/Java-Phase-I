package IO.src.reflect;

import java.lang.reflect.Method;

/**
 *重点：必须掌握，通过反射机制怎么调用一个对象的方法？
 *  反射机制，让代码很具有通用性，可变化的内容都是写到配置文件当中，
 *  将来修改配置文件之后，创建的对象不一样了，调用的方法也不同了，
 *  但是java代码不需要做任何改动，这就是反射机制的魅力。
 *
* */
public class reflectTest11 {
    public static void main(String[] args) {
        try {
            //使用反射机制来调用一个对象的方法该怎么办
            Class<?> aClass = Class.forName("IO.src.reflect.User.UserService");
            //创建对象
            Object o = aClass.newInstance();
            //获取Method
            Method login = aClass.getDeclaredMethod("login", String.class, String.class);
            /*调用方法
            调用方法有几个要素？也需要四要素
            反射机制中最最最最最重要的一个方法，必须记住
            四要素
            obj对象
            Method方法
            ”admin“ ”123“ 实参
            value返回值
            * */
            Object value = login.invoke(o, "admin", "123");
            System.out.println(value);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
