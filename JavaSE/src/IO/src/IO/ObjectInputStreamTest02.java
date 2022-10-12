package IO.src.IO;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.List;

//反序列化集合
public class ObjectInputStreamTest02 {
    public static void main(String[] args) throws Exception {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("F:\\其他\\temp.txt"));
        //Object obj = ois.readObject();
        //System.out.println(obj instanceof List);
        List<Student> list = (List<Student>) ois.readObject();
        for (Student student : list) {
            System.out.println(student);
        }
        ois.close();
    }
}
