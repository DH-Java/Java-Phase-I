package IO.boge;

import java.io.File;
import java.io.FileFilter;
//遍历功能
public class FileTest10 {
    public static void main(String[] args) {
        File file = new File("F:\\zujian\\Common\\VSPerfCollectionTools\\vs2019");
        File[] files = file.listFiles(new FileFilter() {
            @Override
            /*
            获取目录下的所有VSPerf，然后对xml过滤
            * */
            public boolean accept(File pathname) {
                return pathname.getName().startsWith("VSPerf");
            }
        });
        for (File fi:files
             ) {
            System.out.println(fi.getName());
        }
    }
}
