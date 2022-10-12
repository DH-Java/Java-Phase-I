package Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

//
//
/*
* 关于java.util.Collection接口中常用的方法。
* 1、Collection中能存放什么元素？
*   没有使用泛型之前，Collection中可以存储Object的所有子类型。
*    使用泛型之后，Collection中只能存储某个具体的类型。
*    集合后期我们会学习“泛型”语法，目前先不用管。Collection什么都能存，
*    只要是Object的子类型就行。（集合中不能直接存储基本数据类型，也不能存
*    Java对象，只能存储java对象的内存地址。）
*
* 2、Collection中的常用方法
*     boolean add（Object e）向集合中添加元素
*     int size()获取集合元素的个数
*     int clear()清空集合
*     boolean contains(Object O)判断当前集合是否包含元素o，包含返回true，不包含返回false；
*     boolean remove(Object o)删除集合中的某个元素。
*     boolean isEmpty();判断集合是否为空（集合是否存在元素）
*     Object[] toArray（） 调用这个方法可以把集合转换成数组。
* */
public class CollectionTest01 {
    public static void main(String[] args) {
        //创建一个集合对象
        //Collection collection = new Collection();//接口是抽象的，无法实例化。
        //多态
        Collection collection1 = new ArrayList();
        //测试Collection接口中的常用方法
        collection1.add(1200);//自动装箱，实际上是放进去了一个对象的内存地址。Integer x = new Integer（1200）
        collection1.add(3.14);
        collection1.add(new Object());
        collection1.add(true);
        collection1.add(1);
        collection1.add(2);
        collection1.add(3);
        Iterator iterator = collection1.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        //获取集合中元素的个数
        System.out.println(collection1.size());

        collection1.clear();
        System.out.println(collection1.size());
        //判断集合中是否有某个元素
        collection1.add("hello");
        collection1.add("world");
        collection1.add("绿巨人");
        collection1.add("浩克");
        boolean flag = collection1.contains("绿巨人");
        System.out.println(flag);
        System.out.println(collection1.contains("浩克"));

        collection1.remove("hello");
        System.out.println(collection1.size());

        //判断集合是否为空（集合是否存在元素）
        System.out.println(collection1.isEmpty());
        //清空
        collection1.clear();
        System.out.println(collection1.isEmpty());

        collection1.add("abc");
        collection1.add("abe");
        collection1.add("abd");
        collection1.add("abf");

        //转换成数组
        Object []o = collection1.toArray();
        for (int i = 0; i <o.length ; i++) {
            Object o1 = o[i];
            System.out.println(o1);
        }


    }
}
