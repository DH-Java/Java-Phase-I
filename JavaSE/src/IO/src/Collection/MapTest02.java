package IO.src.Collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapTest02 {
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<>();
        //向Map集合添加键值对
        map.put(1,"zhangsan");
        map.put(2,"lisi");
        map.put(3,"wangwu");
        map.put(4,"dengjie");
        //遍历Map集合
        //获取所有的key，所有的key是一个Set集合
        Set<Integer> keys = map.keySet();
        System.out.println("----------------------------------");
        //遍历key，通过key获取value
        //迭代器可以
        Iterator<Integer> iterator = keys.iterator();
        while (iterator.hasNext()){
            //取出一个key
            Integer key = iterator.next();
            //通过key获取value
            String value = map.get(key);
            System.out.println(key + " = " + value);

        }
        for (Integer key1:keys
        ) {
            System.out.println(key1 + " = " + map.get(key1));
        }
        //第二种方式Set<Map.Entry<K,V>> entrySet()
        //将Map集合转换成Set集合
        //set集合中元素的类型是Map.Entry
        Set<Map.Entry<Integer,String>> set = map.entrySet();
        //遍历set集合，每一次取出一个Node
        //迭代器
        Iterator<Map.Entry<Integer,String>> it  =  set.iterator();
        while (it.hasNext()){
            Map.Entry<Integer,String> node = it.next();
            Integer key = node.getKey();
            String value = node.getValue();
            System.out.println(key + " = " + value);
        }
        //这种方式效率比较高。
        for (Map.Entry<Integer,String> node:set
             ) {
            System.out.println(node.getKey() + " = " + node.getValue());
        }
    }
}
