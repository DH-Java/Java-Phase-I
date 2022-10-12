package IO.src.IO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
FileInputStream类的常用方法：
    int available():返回流当中的剩余的没有读到的字节数量
    long skip(long n)：跳过几个字节不读
*/
public class FileInputStreamTest05 {
    public static void main(String[] args) {
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("F:\\其他\\temp.txt");
            //总字节数量
            System.out.println(fis.available());
            //读一个字节
            int readByte = fis.read();
            //还剩下可以读的字节数量是多少：124
            System.out.println(fis.available());
            //这个方法有什么用？
            byte[] bytes = new byte[fis.available()];//这种方式不适合太大的文件，因为byte[]数组不能太大。
            //不需要循环
            //直接读一次就行了。
            int redCount = fis.read(bytes);
            System.out.println(new String(bytes));

            //skip跳过几个字节不读取这个方法也可能以后会用！
            fis.skip(3);
            System.out.println(new String(bytes));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
