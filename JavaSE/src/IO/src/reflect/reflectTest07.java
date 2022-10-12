package IO.src.reflect;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public class reflectTest07 {
    public static <Fields> void main(String[] args) throws Exception {
        Class c1 = Class.forName("IO.src.reflect.User.Student");
        String getName  = c1.getName();
        System.out.println("完整类名"+getName);
        System.out.println("======================");
        String SimpleName = c1.getSimpleName();
        System.out.println("简类名"+SimpleName);


        //取出所有public修饰符的Field
        Field[] fields1 = c1.getFields();
        System.out.println(fields1.length);
        //取出这个Field
        Field fields2 = fields1[0];
        //获取这个Field的名字
        String s1 = fields2.getName();
        System.out.println(s1);
        //获取所有的Field。
        Field[] fields = c1.getDeclaredFields();
        System.out.println(fields.length);
        System.out.println("====================");
        for(Field f :fields){
            //获取属性的名字
            System.out.println(f.getName());
            //获取属性的简单数据类型
            Class c2=f.getType();
            String s2 = c2.getSimpleName();
            System.out.println(s2);
            //获取属性的修饰符列表
            int i = f.getModifiers();
            String s4 = Modifier.toString(i);
            System.out.println(s4);
        }
    }
}
