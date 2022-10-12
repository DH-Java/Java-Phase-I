package IO.src.IO.boge;

import java.io.File;

//遍历功能
public class FileTest08 {
    public static void main(String[] args) {
        File file = new File("F:\\zujian\\Common\\VSPerfCollectionTools\\vs2019");
        String[] list = file.list();
        for (String s:list
             ) {
            System.out.println(s);
        }
        System.out.println("============================");
        File[] files = file.listFiles();
        for (File file1:files
             ) {
            System.out.println(file1.getAbsolutePath());
            System.out.println(file1.getName());
            System.out.println(file1.length());
            System.out.println("****************************");
        }
    }
}
