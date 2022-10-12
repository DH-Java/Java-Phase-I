package IO.src.IO.boge;

import java.io.File;

public class FileTest14 {
    /*
    * 通过递归的方式删除某个目录下的所有的文件的目录文件
    *   1、封装目录对应的File对象
    *   2、获取该目录下的所有的文件及文件夹
    *   3、遍历获取每个文件及文件夹
    *   4、判断该File是文件还是文件夹
    *   5、是文件  采用delete方法删除即可
    *   6、如果是空的文件夹  删除文件夹接口
    *   7、如果不是空的文件夹  回到第二步 递归处理
    * */
    public static void main(String[] args) {
            deleteDemo(new File("F:\\Revise"));
    }
    /*
    *@Author:DH
    *@Date:2021/11/2 18:32
    *@Description:TODO
    ** @param srcForm
    *@return:void
    */
    public static void deleteDemo(File srcForm){
        if (srcForm == null){
            throw new NullPointerException("目录为空");
        }
        File[] files = srcForm.listFiles();
        if (files.length!=0){
            for (File file:files
                 ) {
                if (file.isFile()){
                    System.out.println(file.delete()+"已删除"+file.getName()+"文件");
                }else {
                    deleteDemo(file);
                }
            }
        }
    }
}
