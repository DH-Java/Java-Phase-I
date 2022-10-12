package IO.src.IO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * 使用FileInputStream + FileOutputStream 完成文件的拷贝。
 * 拷贝的过程应该是一边读，一边写。
 * 使用以上的字节流拷贝文件的时候，文件类型随意，万能的，什么样的文件都能拷贝。
 * */
public class Copy01 {
    public static void main(String[] args) {
        FileInputStream fis = null;
        FileOutputStream fos = null;
        try {
            //创建一个输入流对象。
            fis = new FileInputStream("F:\\idea\\io\\temp.txt");
            //创建一个输出流对象。
            fos = new FileOutputStream("F:\\idea\\io\\make.txt");

            //最核心的：一边读，一边写
            byte[] bytes = new byte[1024 * 1024];//1MB(一次最多拷贝1MB。)
            int redCount = 0;
            while ((redCount = fis.read(bytes)) != -1) {
                fos.write(bytes, 0, redCount);
            }
            //刷新，输出流最后要刷新
            fos.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //分开try，不要一起try。
            //一起try一个出现问题，可能会影响另一个。
            if (fis != null) {
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (fos != null) {
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
