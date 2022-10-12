package IO.src.IO;

import java.io.*;

//BufferedWriter:带有缓冲的字符输出流
//OutputStreamWriter:转换流。
public class BufferedWriterTest {
    public static void main(String[] args) throws IOException {
        //带有缓冲区的字符输出流。
        //BufferedWriter out = new BufferedWriter(new FileWriter("F:\\idea\\io\\temp.txt",true));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("F:\\其他\\temp.txt", true)));
        //开始写
        out.write("Hello World");
        out.write("\n");
        out.write("Hello kitty");

        //刷新
        out.flush();
        //关闭
        out.close();
    }
}
