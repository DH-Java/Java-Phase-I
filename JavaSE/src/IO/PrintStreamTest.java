package IO;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.PrintStream;

//java.io.PrintStream:标准的字节输出流。默认输出到控制台。
public class PrintStreamTest {
    public static void main(String[] args) throws Exception {
        //联合起来写
        System.out.println("Hello world");

        //分开写
        PrintStream ps = System.out;
        ps.println("Hello zhangsan");
        ps.println("Hello zhann");
        ps.println("Hello zhangsfan");


        //标准输出流不需要手动关闭。

        //可以改变标准输出流的输出方向吗？可以。
        //这些都是之前System类使用过的方法和属性。
        /*System.gc();
        System.currentTimeMillis();
        PrintStream PS = System.out;
        System.exit(0);
        System.arraycopy(.....);*/


        //标准输出流不再指向控制台，指向“make”文件。
        PrintStream printStream = new PrintStream(new FileOutputStream("F:\\其他\\make.txt"));
        //修改输出方向，将输出方向修改到“make”文件。
        System.setOut(printStream);
        //在输出
        System.out.println("HelloWorld");
        System.out.println("Hellomath");
        System.out.println("Hellokitty");

    }
}