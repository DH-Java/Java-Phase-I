package IO.src.Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

//无序且不可重复，但是自动排序。
public class ArrayListTest02 {
    public static void main(String[] args) {
        List list = new ArrayList();
        List list1 = new ArrayList(20);
        Collection collection = new HashSet();//底层是一个hashmap集合，是一个哈希表数据结构
        collection.add(100);
        collection.add(50);
        collection.add(200);
        collection.add(150);
        collection.add(200);
        List list2 = new ArrayList(collection);
        for (int i = 0; i <list2.size() ; i++) {
            System.out.println(list2.get(i));
        }
    }
}
