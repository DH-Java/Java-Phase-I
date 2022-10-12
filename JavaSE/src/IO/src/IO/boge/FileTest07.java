package IO.src.IO.boge;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
* File 判断功能
*   boolean isAbsolute() 测试这个抽象路径名是否是绝对的。
    boolean isDirectory() 测试此抽象路径名表示的文件是否为目录。
    boolean isFile() 测试此抽象路径名表示的文件是否为普通文件。
    boolean isHidden() 测试此抽象路径名命名的文件是否为隐藏文件。
    long lastModified() 返回此抽象路径名表示的文件上次修改的时间。
    long length() 返回由此抽象路径名表示的文件的长度。
    boolean canRead() 测试应用程序是否可以读取由此抽象路径名表示的文件。
    boolean canWrite() 测试应用程序是否可以修改由此抽象路径名表示的文件
    boolean exists() 测试此抽象路径名表示的文件或目录是否存在
    String getAbsolutePath() 返回此抽象路径名的绝对路径名字符串
    String getPath() 将此抽象路径名转换为路径名字符串。
    String getName() 返回由此抽象路径名表示的文件或目录的名称
    String getParent() 返回此抽象路径名的父目录的路径名字符串，如果此路径名未命名为父目录，则返回 null
*
* */
public class FileTest07 {
    public static void main(String[] args) throws IOException {
        File file = new File("user.java");
        boolean newFile = file.createNewFile();
        //判断是否是文件
        System.out.println(file.isFile());

        //判断是否是目录
        System.out.println(file.isDirectory());

        //判断是否可读
        System.out.println(file.canRead());

        //判断是否可写
        System.out.println(file.canWrite());

        //判断是否存在
        System.out.println(file.exists());

        //判断是否隐藏
        System.out.println(file.isHidden());

        //长度
        System.out.println(file.length());

        //获取绝对路径
        System.out.println(file.getAbsolutePath());

        //定义的路径
        System.out.println(file.getParent());

        //获取文件名称
        System.out.println(file.getName());
        //获取最后一次修改时间
        System.out.println(file.lastModified());
        Date date = new Date(file.lastModified());
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println(simpleDateFormat.format(date));
    }
}
