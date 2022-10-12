package Collection;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/*
* 1、Map和Collection没有继承关系。
* 2、Map集合以key和value的方式存储数据：键值对key和value都是引用数据类型。
* key和value都是存储对象的内存地址。
* key起到主导作用，value是key的一个附属品。
* 3、map接口中常用的方法：
*void clear()  清空Map集合
* boolean containsKey(Object key)   判读Map中是否包含某个Key
 * boolean containsValue(Object value)  判读Map中是否包含某个value
 *V get(Object key)  通过key获取value
 * boolean isEmpty()  判断Map集合中元素个数是否为0；
 * Set<K> keySet()  获取Map集合所有的key（所有的key是一个set集合）
 * V put(K key, V value)向Map集合中添加键值对
 *V remove(Object key)  通过key删除键值对
 * int size() 获取Map集合中键值对的个数
 * Collection<V> values() 获取Map集合中所有的value，返回一个Collection
 * Set<Map.Entry<K,V>> entrySet()将Map集合转换成Set集合
 * map1集合
 * key    value
 * ==================
 * 1        zhangsan
 * 2        lisi
 * 3        wangwu
 * Set set = map1.entrySet（）；
 * set集合对象
 * 1=zhangsan 【注意：Map集合通过entrySet（）方法转换的这个Set集合，Set集合中元素的类型是Map.Entry<K,V>】是静态内部类
 * 2=lisi
 * 3=wangwu
 * */
public class MapTest01 {
    public static void main(String[] args) {
        //创建Map集合
        Map<Integer,String> map = new HashMap<>();
        //向Map集合添加键值对
        map.put(1,"zhangsan");
        map.put(2,"lisi");
        map.put(3,"wangwu");
        map.put(4,"dengjie");
        //通过key获取value
        String value = map.get(4);
        System.out.println(value);

        //获取键值对的数量
        System.out.println(map.size());
        //通过key删除key-value
        map.remove(4);
        System.out.println(map.size());
        //判断是否包含某个key
        //contains方法底层调用的都是equals进行对比的，所以自定义的类型需要重写equals方法
        System.out.println(map.containsKey(4));
        //判断是否包含某个value
        System.out.println(map.containsValue(new String("dengjie")));

        //获取所有的value
        Collection<String> values = map.values();
        for (String s:values
             ) {
            System.out.println(s);
        }
        //清空map集合
        map.clear();
        System.out.println(map.size());
        //判断是否为空
        System.out.println(map.isEmpty());
    }
}
