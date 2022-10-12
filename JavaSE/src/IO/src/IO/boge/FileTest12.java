package IO.src.IO.boge;

import java.io.File;
import java.io.FileFilter;

public class FileTest12 {
    public static void main(String[] args) {
        File path =new File( "F:\\zujian\\Common\\VSPerfCollectionTools\\vs2019");
        System.out.println(getFileCount(path,".xml"));
        System.out.println("=================================");
        System.out.println(getFileCount1(path, "xml"));


    }
    /*
    *@Author:DH
    *@Date:2021/10/28 12:34
    *@Description:TODO
    ** @param srcFile
     * @param Suffix
    *@return:int
    */
    public static int getFileCount(File srcFile , String Suffix) {
        //统计满足条件的文件的个数
        int count = 0;
        File[] files = srcFile.listFiles();
        for (File file:files){
            String name = file.getName();
            if (file.isFile()&&name.endsWith(Suffix)){
                count++;
                System.out.println(name);
            }
        }
        return count;
    }
    /*
    *@Author:DH
    *@Date:2021/10/28 12:55
    *@Description:TODO
    ** @param srcFile
     * @param Suffix
    *@return:int
    */
    //这种方式效率高些
    public static int getFileCount1(File srcFile , String Suffix){
        File[] file = srcFile.listFiles(new FileFilter() {
            @Override
            public boolean accept(File pathname) {

                return pathname.isFile()&&pathname.getName().endsWith(Suffix);
            }
        });
        for (File file1:file
             ) {
            System.out.println(file1.getName());
        }
        return file.length;
    }
}
