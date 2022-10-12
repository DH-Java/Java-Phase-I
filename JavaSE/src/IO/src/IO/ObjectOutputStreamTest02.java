package IO.src.IO;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

/*
 * 一次序列化多个对象呢？
 *   可以，可以将对象放到集合当中，序列化集合。
 * 提示：
 *   参与序列化的ArrayList集合以及集合中的元素Student都需要实现java.io.Serializable接口
 * */
public class ObjectOutputStreamTest02 {
    public static void main(String[] args) throws Exception {
        List<Student> list = new ArrayList<>();
        list.add(new Student(1, "zhangsan"));
        list.add(new Student(2, "lisi"));
        list.add(new Student(3, "wangwu"));
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("F:\\其他\\temp.txt"));
        oos.writeObject(list);
        oos.flush();
        oos.close();
    }
}
