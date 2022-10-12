package reflect;

import reflect.User.UserTest;
/*
* 获取到Class，能干什么？
*   通过Class的newInstance（）方法来实例化对象。
*   注意：newInstance（）方法内部实际上调用了无参数构造方法，主要保证无参数构造方法存在才可以。
* */
public class reflectTest03  {
    public static void main(String[] args) {
        //这是不使用反射机制，创建对象
        UserTest u = new UserTest();
        System.out.println(u);
        try {
            //通过反射机制，获取Class，通过Class来获取实例化对象
            Class c = Class.forName("reflect.User.UserTest");//c代表User类型
            try {
                //newInstance（）这个方法会调用UserTest这个类的无参数构造方法，完成对象的创建。
                //重点是：newInstance（）调用的是无参数构造方法，必须保证无参数构造方法存在的！
                Object obj = c.newInstance();
                System.out.println(obj);//reflect.User.UserTest@1b6d3586
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
