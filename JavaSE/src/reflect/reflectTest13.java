package reflect;

public class reflectTest13 {
    public static void main(String[] args) {
        try {
            Class<?> aClass = Class.forName("java.lang.String");
            //获取当前类的父类
            Class<?> superclass = aClass.getSuperclass();
            System.out.println("当前类的父类"+superclass);

            //获取当前类实现的所有接口
            Class[] interfaces = aClass.getInterfaces();
            for (Class i:interfaces)
            System.out.println("当前类的所有接口"+i.getSimpleName());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
