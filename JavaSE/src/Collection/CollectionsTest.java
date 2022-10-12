package Collection;

import java.util.*;

/*
* java.util.Collection 集合接口
* java.util.Collections  集合工具类，方便集合的操作
*
* */
public class CollectionsTest {
    public static void main(String[] args) {
        //ArrayList不是线程安全的。
        List<String> list = new ArrayList<>();

        //变成线程安全的
        Collections.synchronizedList(list);

        //排序
        list.add("daf");
        list.add("aaf");
        list.add("dff");
        list.add("crf");
        //排序
        Collections.sort(list);
        //foreach循环
        for (String s: list
             ) {
            System.out.println(s);
        }

        List<WuGui2> wuGuis = new ArrayList<>();
        wuGuis.add(new WuGui2(1000));
        wuGuis.add(new WuGui2(104));
        Collections.sort(wuGuis);
        for (WuGui2 DuGui:wuGuis
             ) {
            System.out.println(DuGui);
        }
        //对Set集合怎么排序？
        Set<String> set = new HashSet<>();
        set.add("king");
        set.add("dfing");
        set.add("king2");
        set.add("king1");
        //将Set集合转换成list集合
        List<String> list1 = new ArrayList<>(set);
         Collections.sort(list1);
        for (String make:list1
             ) {
            System.out.println(make);
        }
        //这种方式也可以排序。
        //Collections.sort(list集合，比较器对象);
    }
}
//实现compereTo方法必须实现Comparable接口。
class WuGui2 implements Comparable<WuGui2>{
    int age;

    public WuGui2(int age) {
        this.age = age;
    }

    @Override
    //比较方法compereTo方法
    public int compareTo(WuGui2 o) {
        return this.age-o.age;
    }

    @Override
    public String toString() {
        return "WuGui2{" +
                "age=" + age +
                '}';
    }
}

