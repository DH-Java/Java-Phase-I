package IO.src.Collection;


import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

/*
* Vector
* 1底层也是个数组
* 2初始化容量：10
* 3怎么扩容的？
* 10-->20-->40-->80
* ArrayList集合扩容特点
* ArrayList扩容是原有容量的1.5倍。
*
* 怎么将一个线程不安全的ArrayList集合转换成线程安全的
* 使用集合工具类
* Java.util.Collections;集合工具类
* java.util.Collection;集合接口
* */
public class VectorTest {
    public static void main(String[] args) {
         Vector vector = new Vector();
        vector.add(1);
        vector.add(2);
        vector.add(3);
        vector.add(4);
        vector.add(5);
        vector.add(6);
        vector.add(7);
        vector.add(8);
        vector.add(9);
        vector.add(10);
        //满了之后扩容（扩容之后是20）
        vector.add(11);



            List list = new Vector();
            //转换成线程安全的
            Collections.synchronizedList(list);
            //list集合就是线程安全的了
            list.add("abc");
            list.add("def");
            list.add("ghi");
            Iterator iterator = list.iterator();
        while (iterator.hasNext()){
            Object o = iterator.next();
            System.out.println(o);


        }
    }
}
