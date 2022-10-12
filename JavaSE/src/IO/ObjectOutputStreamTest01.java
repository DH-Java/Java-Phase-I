package IO;

import IO.Student;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

/*
 * java.io.NoSerializableException:
 *   Student对象不支持序列化！！！
 *
 * 2、参与序列化和反序列化的对象，必须实现Serializable接口。
 *
 * 3、注意：通过源代码发现，Serializable接口只是一个标志接口：
 * public interface Serializable{
 * }
 * 这个接口当中什么代码都没有。
 * 那么它起到一个什么作用呢？
 *       起到标识的作用，标志的作用，java虚拟机看到这个类实现了这个接口，可能会对这个类进行特殊待遇。
 *       Serializable这个标志接口是给java虚拟机参考的，java虚拟机看到这个接口之后，会为该类自动生成一个序列化版本号。
 *4、序列化版本号有什么用
 * 自动生成序列化版本号。（缺陷：一旦代码确定后，不能进行后续的修改）
 * 序列号版本号可以用来区分类。
 *
 * */
public class ObjectOutputStreamTest01 {
    public static void main(String[] args) throws Exception {
        //创建java对象
        Student student = new Student(111, "zhangsan");
        //序列化
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("F:\\其他\\temp.txt"));

        //序列化对象
        oos.writeObject(student);

        //刷新
        oos.flush();
        //关闭
        oos.close();
    }

}
