package IO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamTest04 {
    public static void main(String[] args) {
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("F:\\idea\\io\\temp.txt");
            byte[] bytes = new byte[4];
            int RedCound = 0;
            while ((RedCound = fis.read(bytes)) != -1) {
                //把byte数组转换成字符串，读到多少个就转换多少个。o
                System.out.print(new String(bytes, 0, RedCound));
            }


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
