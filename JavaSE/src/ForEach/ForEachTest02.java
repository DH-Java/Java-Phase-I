package ForEach;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ForEachTest02 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("hello");
        list.add("world");
        list.add("whi");
        //使用下标方式
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        for (String date : list) {
            System.out.println(date);
        }
    }
}