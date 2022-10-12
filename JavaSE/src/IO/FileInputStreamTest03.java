package IO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
 * int read（byte [] b）
 *       一次最多读取b.length个字节
 *       减少硬盘和内存的交互，提高程序的执行效率。
 *       往byte[]数组当中读。
 * */
public class FileInputStreamTest03 {
    public static void main(String[] args) {
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("F:\\其他\\temp.txt");

            //开始读，采用byte数组，一次读取多个字节，最多读取“数组.length”个字节。
            byte[] bytes = new byte[4];//准备一个4个长度的byte数组，一次最多读取4个字节。
            int count = fis.read(bytes);
            System.out.println(count);//第一次读到4个字节。
            //将字节数组全部转换成字符串。
            //System.out.println(new String(bytes));
            //不应该全部转换，应该是读取了多少个字节，转换多少个。
            System.out.println(new String(bytes, 0, count));
            count = fis.read(bytes);
            System.out.println(count);//第二次只能读到2个字节。
            //将字节数组全部转换成字符串 。
            //System.out.println(new String(bytes));
            //不应该全部转换，应该是读取了多少个字节，转换多少个。
            System.out.println(new String(bytes, 0, count));
            count = fis.read(bytes);
            System.out.println(count);//一个字节都没有读到返回-1.

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fis != null) {
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
