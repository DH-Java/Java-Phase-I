package IO.src.Collection;

import java.util.HashSet;
import java.util.Set;
/*
* 向Map集合中存，以及从Map集合中取，都是先调用key的hashCode方法，然后在调用equals方法！
* equals方法有可能调用，也有可能不调用。
* 拿put（K,V）举例，什么时候equals不会调用？
*       k.hashCode()方法返回哈希值，
*       哈希值经过哈希算法转换成数组下标。
*       数组下标位置上如果是null，equals不会执行。
* 拿get（k）举例，什么时候equals不会调用？
*       k.hashCode()方法返回哈希值，
 *       哈希值经过哈希算法转换成数组下标。
 *       数组下标位置上如果是null，equals不会执行。
 *
 * 2、注意：如果一个类的equals方法重写了，那么hashCode（）方法必须重写。
 * 并且equals方法返回如果是true,hashCode()方法返回的值必须是一样的。
 *
 * 3、hashCode和equals直接生成。
 * 4、终结结论：
 *      放在HashMap集合key部分的，以及放在HashSet集合中的元素，需要同时重写hashCode和equals方法。
 *
 * 5、对于哈希表数据结构来说：
 *          如果o1和o2的hash值相同，一定是要放到同一个单向链表。
 *          当然如果o1和o2的hash值不同，但由于哈希算法执行结束之后转换的数组下标可能相同，此时会发生“哈希碰撞”。
 */

public class HashMapTest02 {
    public static void main(String[] args) {
    Student student = new Student("zhangsan");
    Student student1 = new Student("zhangsan");
    //重写equals表示true。
        System.out.println(student.equals(student1));

        //在student类中重写了hashCode方法。
        System.out.println(student.hashCode());
        System.out.println(student1.hashCode());
        //创建HashSet数组
        Set<Student> students = new HashSet<>();
        students.add(student);
        students.add(student1);
        System.out.println(students.size());
   }
}
