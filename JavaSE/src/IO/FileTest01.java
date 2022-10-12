package IO;

import java.io.File;

/*
 * File
 *       1、File类和四大家族没有关系，所以Flie类不能完成文件的读和写。
 *       2、File对象代表什么？
 *           文件和目录路径名的抽象表达形式。
 *           F：\其他  这是一个File对象
 *           一个File对象有可能对应的是目录，也可能是文件。
 *           File只是一个路径名的抽象表示形式。
 *       3、需要掌握File类中常用的方法
 * */
public class FileTest01 {
    public static void main(String[] args) throws Exception {
        //创建一个File对象
        File f1 = new File("F:\\其他\\temp");
        //判断是否存在！
        System.out.println(f1.exists());

        //如果temp不存在，则以文件的形式创建出来。
        //f1.createNewFile();

        //如果temp不存在，则以目录的形式创建出来。
       /* if (!f1.exists()){
            f1.mkdir();
        }*/
        File f2 = new File("F:\\其他\\a\\b\\c");
        if (!f2.exists()) {
            f2.mkdirs();
        }
        File f3 = new File("F:\\其他\\a\\b\\c");
        //获取父路径
        String parentPath = f3.getParent();
        System.out.println(parentPath);
        File parentFile = f3.getParentFile();
        System.out.println("获取绝对路径：" + parentFile.getAbsolutePath());

    }
}
