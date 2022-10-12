package IO.src.IO.boge;

import java.io.File;

/*
* File构造方法
* */
public class FileTest02 {
    public static void main(String[] args) {
        /*
        * File(File parent, String child) 从父抽象路径名和子路径名字符串创建新的 File实例。
          File(String pathname) 通过将给定的路径名字符串转换为抽象路径名来创建新的 File实例。
          File(String parent, String child) 从父路径名字符串和子路径名字符串创建新的 File实例。
          File(URI uri) 通过将给定的 file: URI转换为抽象路径名来创建新的 File实例。
        * */
        File f1 = new File("F:\\其他\\make.txt");
        System.out.println(f1);
        File f2 = new File("F:\\其他\\", "a.txt");
        System.out.println(f2);
        File f3 = new File("F:\\其他");
        System.out.println(f3);
        File f4 = new File(f3, "d.txt");
        System.out.println(f4);

    }
}
