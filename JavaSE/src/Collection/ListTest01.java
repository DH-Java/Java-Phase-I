package Collection;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

//测试list接口中常用的方法
//list集合存储特点有序可重复。
/*
* list接口特有的常用的方法
* void add(int index, E element)
* E get(int index)
* int indexOf(Object o)
* int lastIndexOf(Object o)
* E remove(int index)
* E set(int index, E element)
 * */
public class ListTest01 {
    public static void main(String[] args) {
        List MyList = new ArrayList();
        MyList.add("A");//默认是向集合末尾添加元素。
        MyList.add("B");
        MyList.add("C");
        MyList.add("D");
        //在列表的指定位置插入指定元素（第一个参数是下标）

        MyList.add(1,"KING");

        Iterator i = MyList.iterator();
        while (i.hasNext()){
            Object o =i.next();
            System.out.println(o);
        }
        //根据下标获取元素。
        Object get = MyList.get(0);
        System.out.println(get);

        //获取指定对象第一次出现处的索引。
        System.out.println(MyList.indexOf("KING"));

        //获取指定对象最后一次出现处的索引。
        System.out.println(MyList.lastIndexOf("D"));

        //删除指定下标位置的元素
        MyList.remove(0);
        System.out.println(MyList.size());

        //修改指定的位置的元素
        MyList.set(2,"soft");
        System.out.println(MyList.get(2));

        for (int j = 0; j <MyList.size() ; j++) {
            Object o =MyList.get(j);
            System.out.println(o);
        }

    }
}
