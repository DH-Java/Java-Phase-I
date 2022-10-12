package IO.boge;

import java.io.File;
//遍历功能
public class FileTest11 {
    public static void main(String[] args) {
        File[] files = File.listRoots();
        for (File file:files
             ) {
            System.out.println(file);
        }
    }
}
