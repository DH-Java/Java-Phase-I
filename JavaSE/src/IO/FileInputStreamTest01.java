package IO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
java.io.FileInputStream;
    1、文件字节输入流，万能的，任何类型的文件都可以采用这个流来读。
    2、字节的方式，完成输入的操作，完成读的操作（硬盘-->内存）
*/
public class FileInputStreamTest01 {
    public static void main(String[] args) {
        FileInputStream fis = null;
        //创建文件字节输入流。
        try {
            fis = new FileInputStream("F:\\其他\\temp.txt");

            //开始读
            int red = fis.read();//这个方法的返回值是：读取到的“字节”本身
            System.out.println(red);//97
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //在finally语句当中确保流一定关闭。
            if (fis != null) {//避免空指针异常。
                //关闭流的前提是：流不是空。流是null没必要关闭。
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
