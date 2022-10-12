package IO.src.Collection;

import java.util.Properties;

/*
* 目前只需要掌握Properties属性类对象的相关方法即可。
* Properties是一个Map集合，继承Hashtable，Properties的key和value都是String类型。
* Properties被称为属性类对象。
* Properties是线程安全的。
* */
public class PropertiesTest01 {
    public static void main(String[] args) {
        //创建一个Properties对象
        Properties properties = new Properties();
        //需要掌握Properties的两个方法，一个存，一个取。
        properties.setProperty("123","456");
        properties.setProperty("789","101");
        properties.setProperty("141","4416");
        properties.setProperty("4213","441");

        //通过key获取value
        String s = properties.getProperty("123");
        String s1 = properties.getProperty("789");
        String s2 = properties.getProperty("141");
        String s3 = properties.getProperty("4213");

        System.out.println(s);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
    }
}
