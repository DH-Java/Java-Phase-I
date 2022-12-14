package IO;

import java.io.DataInputStream;
import java.io.FileInputStream;

/*
 * DataInputStream:数据字节输入流
 * DataInputStream写的文件，只能使用DataOutputStream去读。而且读的时候你需要提前知道写入的顺序。
 * 读的顺序需要和写的顺序一致，才可以正常取出数据。
 * */
public class DataInputStreamTest01 {
    public static void main(String[] args) throws Exception {
        DataInputStream dis = new DataInputStream(new FileInputStream("F:\\其他\\make.txt"));
        //开始读
        byte b = dis.readByte();
        short s = dis.readShort();
        int i = dis.readInt();
        long l = dis.readLong();
        float f = dis.readFloat();
        double d = dis.readDouble();
        boolean sex = dis.readBoolean();
        char c = dis.readChar();


        System.out.println(b + 100);
        System.out.println(s);
        System.out.println(i);
        System.out.println(l);
        System.out.println(f);
        System.out.println(d);
        System.out.println(sex);
        System.out.println(c);
    }
}
