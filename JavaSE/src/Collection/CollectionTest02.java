package Collection;


import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

//关于集合遍历/迭代专题
public class CollectionTest02 {
    public static void main(String[] args) {
        //注意：以下讲解的遍历方法/迭代方式。是所有Collection通用的一种方式。
        //在Map集合中不能用。在所有的Collection以及子类中使用。
        //创建集合对象
        Collection collection = new ArrayList();//后面的集合无所谓，主要是看前面的Collection接口，怎么遍历/迭代
        Collection collection1 = new HashSet();
        collection1.add(100);
        collection1.add(90);
        collection1.add(344);
        collection1.add(100);
        collection1.add(3445);


        collection.add(80);
        collection.add(414);
        collection.add("abc");
        collection.add("abd");
        collection.add("abe");
        collection.add("abf");
        //对集合Collection进行迭代/遍历
        //第一步：获取集合对象的迭代器对象Iterator
        Iterator iterator = collection.iterator();
        Iterator iterator1 = collection1.iterator();
        //第二步，通过以上获取的迭代器对象开始迭代/遍历集合。
        /*
        以下是迭代器Iterator中的两个方法。
        * boolean hasNext（）如果仍有元素可以迭代，就返回true。
        * Object next（）返回迭代的下一个元素
        * */

        while (iterator.hasNext()) {
            Object obj = iterator.next();
            System.out.println(obj);
        }

        while (iterator1.hasNext()) {
            System.out.println(iterator1.next());
        }
        System.out.println("=====================================");
        Object[] o = collection.toArray();
        System.out.println(o[5]);
    }
}
