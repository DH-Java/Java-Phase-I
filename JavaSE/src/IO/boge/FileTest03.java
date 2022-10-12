package IO.boge;

import java.io.File;
//相对路径和绝对路径
public class FileTest03 {
    public static void main(String[] args) {
        //绝对路径
        File file = new File("F:\\其他\\make.txt");
        //相对路径
        File file1 = new File("temp.txt");
        System.out.println(file1.getAbsolutePath());
    }
}
