package IO.src.IO;

import java.io.FileInputStream;
import java.io.IOException;

//用循环读取。
public class FileInputStreamTest02 {
    public static void main(String[] args) {
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("F:\\其他\\temp.txt");
            /*while (true) {
                int red = fis.read();
                if (red == -1) {
                    break;
                }
                System.out.println(red);*/
            //改造while循环。
            int red = 0;
            while ((red = fis.read()) != -1) {
                System.out.println(red);
            }
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
