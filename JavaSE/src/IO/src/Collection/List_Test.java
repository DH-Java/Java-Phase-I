package IO.src.Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @Date: 2022/09/09/13:18
 * @Description:
 */
public class List_Test {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("乔丹");
        list.add("科比");
        list.add("詹姆斯");
        list.add("库里");
        list.add("罗斯");
        list.add("邓肯");
        list.add("维金斯");
        list.add("奥尼尔");
        list.add("姚明");
        list.add("杜兰特");
        list.add("欧文");
        list.add("哈登");
        list.add(2,"韩顺平");
        System.out.println(list.get(5));
        System.out.println("=====================");
        list.remove(6);
        list.set(7,"小罗伯特唐尼");
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            Object next =  iterator.next();
            System.out.println(next);
        }
    }
}
