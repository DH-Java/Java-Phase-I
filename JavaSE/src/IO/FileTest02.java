package IO;

import javax.xml.crypto.Data;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

//File类的常用方法
public class FileTest02 {
    public static void main(String[] args) {
        File f1 = new File("F:\\其他\\temp.txt");
        //获取文件名
        System.out.println(f1.getName());

        //判断是否是一个目录
        System.out.println(f1.isDirectory());

        //判断是否是一个文件
        System.out.println(f1.isFile());

        //获取文件最后一次修改时间
        long haoMiao = f1.lastModified();//这个毫秒是从1970年到现在的总毫秒数。
        //将总毫秒数转换成日期???
        Date time = new Date(haoMiao);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");
        String str = sdf.format(time);
        System.out.println(str);

        //获取文件大小
        System.out.println(f1.length());

        //File中的listFiles方法。
        //File [] listFiles（）
        //获取当前目录下所有的子文件。
        File file = new File("C:\\Program Files");
        File[] files = file.listFiles();
        //foreach
        for (File file1 : files) {
            System.out.println(file1.getAbsolutePath());
        }
    }
}
