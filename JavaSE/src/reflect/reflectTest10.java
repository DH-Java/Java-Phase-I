package reflect;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class reflectTest10 {
    public static void main(String[] args) {
        try {
            Class<?> aClass = Class.forName("reflect.User.UserService");
            //获取所有的method（包括私有的）
            Method[] declaredMethods = aClass.getDeclaredMethods();
            //遍历method
            for (Method method:declaredMethods
                 ) {
                //获取修饰符列表
                System.out.println(Modifier.toString(method.getModifiers()));
                //获取方法的返回值类型
                System.out.println(method.getReturnType().getSimpleName());
                //获取方法名
                System.out.println(method.getName());
                //方法的参数修饰符列表（一个方法的参数可能会有多个）
                Class<?>[] parameters = method.getParameterTypes();
                for (Class<?> parameter :parameters
                     ) {
                    System.out.println(parameter.getSimpleName());
                }
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}
