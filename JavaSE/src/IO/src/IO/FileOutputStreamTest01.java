package IO.src.IO;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
文件字节输出流，负责写
从内存到硬盘。
* */
public class FileOutputStreamTest01 {
    public static void main(String[] args) throws FileNotFoundException {
        FileOutputStream fos = null;
        try {
            //make文件不存在的时候会自动新建
            //这种方式谨慎使用，这种方式会先将原文件清空，然后重新写入。
            //在文件路径后面加个true，以追加的方式在文件末尾写入。不会清空原文件内容。
            fos = new FileOutputStream("F:\\其他\\temp.txt", true);
            //开始写
            byte[] bytes = {97, 98, 99, 100};
            fos.write(bytes);
            fos.write(bytes, 0, 2);
            //字符串。
            String s = "System.out.println";
            byte[] bytes1 = s.getBytes();
            fos.write(bytes1);

            //写之后一定要刷新。
            fos.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
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
