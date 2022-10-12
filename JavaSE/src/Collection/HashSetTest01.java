package Collection;

import java.util.HashSet;
import java.util.Set;
//无序且不重复，放到HashSet集合中的元素实际上是放到HashMap集合的Key部分了。
public class HashSetTest01 {
    public static void main(String[] args) {
        Set<String> strings = new HashSet<>();
        strings.add("hello1");
        strings.add("hello5");
        strings.add("hello4");
        strings.add("hello6");
        strings.add("hello2");
        strings.add("hello4");
        strings.add("hello1");
        strings.add("hello1");
        for (String txt: strings
             ) {
            System.out.println(txt);

        }
    }
}
