package IO.src.IO.boge;

import java.io.File;

/*
* 创建文件及文件夹
* */
public class FileTest04 {
    public static void main(String[] args) throws Exception {
        File f1 = new File("a.txt");
        //如果路径有问题，那么就会创建失败  返回true 表示创建成功  false 说明文件已经存在，创建失败
        boolean newFile = f1.createNewFile();
        System.out.println(newFile);
        //createNewFile只能创建文件，不能创建文件夹
        File test = new File("test");
        newFile=test.createNewFile();
        System.out.println(newFile);

        //创建文件夹/目录
        File a = new File("a");
        newFile = a.mkdir();//创建一个目录  创建成功true  失败false
        System.out.println(newFile);
        System.out.println(a.getAbsolutePath());
        File file = new File("a/b/c/d");
        //创建目录的父目录不存在，那么 mkdir是不会创建成功的
        boolean mkdir = file.mkdir();
        System.out.println(mkdir);
        //如果目录不存在会先创建该目录
        mkdir = file.mkdirs();
        System.out.println(mkdir);


    }
}
