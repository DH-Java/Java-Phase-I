package Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @Date: 2022/09/09/11:54
 * @Description:
 */
public class Collection_ {
    public static void main(String[] args) {
        List list = new ArrayList<>();
        list.add("jack");
        list.add(10);
        list.add(true);
        System.out.println("list:"+list);
        //remove 两种返回值，一种删除索引，一种删除对象
        list.remove("jack");
        list.remove(0);
        System.out.println("list:"+list);
        //判断集合中元素是否存在，返回值是布尔类型
        System.out.println(list.contains(true));
        //获取集合中有几个元素
        System.out.println(list.size());
        //判断集合中是否为空，返回布尔类型
        System.out.println(list.isEmpty());
        //清空集合中的元素
        list.clear();
        List list1 = new ArrayList();
        list1.add("三国演义");
        list1.add("红楼梦");
        //往集合中添加集合
        list.addAll(list1);
        System.out.println(list);
        //查找多个元素是否都存在

        System.out.println(list.containsAll(list1));
        //
        list.add("Java核心编程");
        //list.removeAll(list1);
        System.out.println(list);
        String[] arr = new String[3];
        Iterator iterator = list.iterator();
        while (iterator.hasNext()){
            for (int i=0;i<list.size();i++){
                arr[i] = (String) iterator.next();
                System.out.println(arr[i]);
            }
        }

        System.out.println("================================");
        //如果希望再次遍历iterator,需要重置我们的迭代器
        iterator=list.iterator();
        iterator.next();

    }
}
