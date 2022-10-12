package IO.boge;

import java.io.File;
import java.io.IOException;

//修改文件夹名字
//renameTo (File dest) 重命名由此抽象路径名表示的文件。
public class FileTest06 {
    public static void main(String[] args) throws Exception {
        File f1 = new File("a.txt");
        boolean newFile = f1.createNewFile();
        System.out.println(newFile);
        boolean b = f1.renameTo(new File("b.txt"));
        System.out.println(b);

        File f2 = new File("a");
        boolean mkdir = f2.mkdir();
        System.out.println(mkdir);
        boolean b1 = f2.renameTo(new File("b"));
        System.out.println(b1);

    }
}
