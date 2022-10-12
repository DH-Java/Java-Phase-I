package IO;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/*
 * 文件字符流输入流，只能读取普通文本。
 * 读取文本内容时，比较方便，快捷。
 * */
public class FileReaderTest {
    public static void main(String[] args) {
        FileReader reader = null;
        try {
            //创建文件字符输入流
            reader = new FileReader("F:\\其他\\temp.txt");
            //准备一个char数组
            char[] chars = new char[4];
            //在char[]数组中读
            reader.read(chars);
            for (char c : chars) {
                System.out.println(c);
            }
            //开始读
            /*char [] chars = new char[4];
            int readCount = 0;
            while ((readCount = reader.read(chars))!=-1){
                System.out.println(new String(chars,0,readCount));
            }*/
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
