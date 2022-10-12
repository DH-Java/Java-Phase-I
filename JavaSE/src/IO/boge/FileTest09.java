package IO.boge;

import java.io.File;
import java.io.FilenameFilter;

//遍历功能
public class FileTest09 {
    public static void main(String[] args) {
        File file = new File("F:\\zujian\\Common\\VSPerfCollectionTools\\vs2019");
        String[] f1 = file.list(new FilenameFilter() {
            @Override
            //添加过滤条件
            //dir  目录
            //name 文件名字

            //true  获取
            //false 过滤
            public boolean accept(File dir, String name) {
                if (name.endsWith(".xml")){
                    return true;
                }
                return false;
            }
        });
        for (String file1:f1
             ) {
            System.out.println(file1);
        }
    }
}
