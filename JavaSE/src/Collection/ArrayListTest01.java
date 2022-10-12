package Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

//默认初始化容量是10(底层先创建了一个长度为0的数组，当添加第一个元素时，初始化容量是10)
//集合底层是一个Object数组。
//ArrayList集合的扩容
//原容量的1.5倍
//ArrayList集合底层是数组，怎么优化
//尽可能的减少扩容。
/*
* 数组的优点
*       检索效率比较高。
* 数组的缺点
*       随即增删元素效率比较低。
*       另外数组无法存储大数据
*
* 向数组末尾添加元素，效率很高，不受影响。
* */
@SuppressWarnings("all")
public class ArrayListTest01 {
    public static void main(String[] args) {
        List list = new ArrayList();
        //容量为20；
        List list1 = new ArrayList(20);

        list.add(1);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);
        list.add(10);
        System.out.println(list.size());
        //检索效率较高，通过下标获取
        System.out.println(list.get(1));
        Iterator iterator = list.iterator();
        while (iterator.hasNext()){
            Object next = iterator.next();
            System.out.println(next);
        }
        //返回指定元素第一次出现索引的位置，如果没有该元素则返回-1.
        System.out.println(list.indexOf(12));
        //添加到下标指定位置
        list.add(10,12);
        System.out.println(list.get(10));
        //再加一个元素
        list.add(11);
        System.out.println(list.size());
        /*int newCapacity = ArraysSupport.newLength(oldCapacity,minCapacity - oldCapacity,oldCapacity >> 1);*/
        //100 二进制转换成10进制：00000100右移一位00000010（2） 【4/2】
        //原先是4，现在增长：2，增长后是6，增长之后的容量是之前容量的：1.5倍。

    }

}
