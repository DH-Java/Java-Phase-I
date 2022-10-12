package Collection;

import java.util.Hashtable;
import java.util.Map;

//HashMap的key可以为null吗？
        //Hashtable的key和value都是不能为null的
        //HashMap的key和value都是可以为空的。


//Hashtable方法都带有synchronization：线程安全的。
//线程安全有其他的方案，这个Hashtable对线程的处理导致效率较低，使用较少了。

//Hashtable和HashMap一样，底层都是哈希表数据结构。
//Hashtable的初始化容量是11，默认加载因子是：0.75f
//Hashtable集合扩容是：原容量*2+1。
public class HashTableTest01 {
    public static void main(String[] args) {
        Map map = new Hashtable();
        map.put(null,"123");
        map.put(1,null);
    }


}
