package IO;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class BufferedReaderTest02 {
    public static void main(String[] args) throws Exception {

        //字节流
        /*FileInputStream fis = new FileInputStream("F:\\idea\\io\\make.txt");

        //通过转换流转换(InputStreamReader将字节流转换成字符流。)
        //fis是节点流，reader是包装流。
        InputStreamReader reader = new InputStreamReader(fis);

        //这个构造方法只能传一个字符流，不能传字节流。
        //reader是节点流，bufferedReader是包装流。
        BufferedReader bufferedReader = new BufferedReader(reader);*/

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream("F:\\idea\\io\\make.txt")));

        String line = null;
        while ((line = bufferedReader.readLine()) != null)
            System.out.println(line);

        //关闭最外层
        bufferedReader.close();
    }
}
