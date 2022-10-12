package IO.boge;

import java.io.File;

//删除文件
//delete() 删除由此抽象路径名表示的文件或目录。
public class FileTest05 {
    public static void main(String[] args) {
        File f1 = new File("a.txt");
        System.out.println(f1.delete());
        File f2 = new File("test");
        System.out.println(f2.delete());
        File f3 = new File("a/b/c/d");
        System.out.println(f3.delete());
        File file = new File("a/b/c");
        System.out.println(file.delete());
    }
}
