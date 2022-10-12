package IO.src.IO.boge;

import java.io.File;


/*
* 把"F:\\Windows Kits\\10\\App Certification Kit\\cs"下的所有dll文件打印到控制台上
*
*
*           分析：
*               1、封装文件的路径
*               2、获取目录下的所有的目录和文件
*               3、获取到每个目录或文件做相应的判断
*               4、判断是文件还是文件夹
*               文件
*                   判断是否是txt文件 是 输出  不是  不处理
*               文件夹
*                   回到第二步  递归处理
* */
public class FileTest13 {
    public static Integer count = 0;
    public static void main(String[] args) {
            getAllTxtFile(new File("F:\\Windows Kits\\10\\App Certification Kit\\cs"),".dll");
            System.out.println(getAllDllCount(new File("F:\\Windows Kits\\10\\App Certification Kit\\cs"),".dll"));
    }
    public static void getAllTxtFile(File srcFile ,String bux){
        File[] files = srcFile.listFiles();
        for (File file:files
             ) {
            if (file.isFile()){
                String name = file.getName();
                if (name.endsWith(bux)){
                    System.out.println(name);
                }
            }else {
                getAllTxtFile(file,bux);
            }
        }
    }
    /*
    *@Author:DH
    *@Date:2021/10/28 13:23
    *@Description:TODO
    ** @param srcFileor
 * @param suffix
    *@return:int
    */
    public static int getAllDllCount(File srcFile,String suffix){
        //统计个数
        File[] files = srcFile.listFiles();
        for (File file:files
        ) {
            if (file.isFile()){
                String name = file.getName();
                if (name.endsWith(suffix)){
                    System.out.println(name);
                    FileTest13.count++;
                }
            }else {
               getAllDllCount(file,suffix);
            }
        }
        return count;
    }
}
