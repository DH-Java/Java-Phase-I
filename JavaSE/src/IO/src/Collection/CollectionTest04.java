package IO.src.Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

//当集合的结构发生改变时，迭代器必须重新获取。如果还是用以前老的迭代器，会出现异常。
//在迭代集合元素的过程中，不能调用集合对象的remove方法，删除元素；
//使用迭代器的remove方法去删，会自动更新迭代器。
public class CollectionTest04 {
    public static void main(String[] args) {
        Collection c1 = new ArrayList();
        c1.add(1);
        c1.add(2);
        c1.add(3);
        c1.add(4);
        Iterator i1 = c1.iterator();
        while (i1.hasNext()){
            Object o = i1.next();
            i1.remove();
            System.out.println(o);
        }
        System.out.println(c1.size());
    }
}
