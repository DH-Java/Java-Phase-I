package Collection;

import java.util.TreeSet;

/*
* 1、TreeSet集合底层实际上是一个TreeMap
* 2、TreeMap集合底层是一个二叉树。
* 3、放到TreeSet集合中的元素，等同于放到TreeMap集合key部分了
* 4、TreeSet集合中的元素：无需不可重复，但是可以按照元素的大小顺序自动排序。
* 称为：可排序集合。
*
* */
public class TreeSetTest01 {
    public static void main(String[] args) {
        //创建一个TreeSet集合
        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("zs");
        treeSet.add("ww");
        treeSet.add("ls");
        treeSet.add("wl");
        //遍历
        for (String s: treeSet
             ) {
            //升序
            System.out.println(s);
        }

    }
}
