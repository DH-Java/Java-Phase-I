package 练习程序;

import java.io.*;

//拷贝目录
public class CopyAll {
    public static void main(String[] args) {
        //拷贝源
        File srcFile = new File("F:\\idea\\Demo_01\\src");
        //拷贝目录
        File destFile = new File("F:\\其他\\a\\b\\c");
        //调用方法拷贝
        copyDir(srcFile, destFile);
    }

    private static void copyDir(File srcFile, File destFile) {
        if (srcFile.isFile()) {
            //srcFile如果是一个文件的话，递归结束。
            //是文件的时候需要拷贝
            //... 一边读一边写
            FileInputStream in = null;
            FileOutputStream out = null;
            try {
                //读这个文件
                in = new FileInputStream(srcFile);
                //写到这个文件中
                String path = (destFile.getAbsolutePath().endsWith("\\") ? destFile.getAbsolutePath() : destFile.getAbsolutePath() + "\\") + srcFile.getAbsolutePath().substring(3);
                out = new FileOutputStream(path);
                //一边读一边写
                byte[] bytes = new byte[1024 * 1024];
                int readCount = 0;
                while ((readCount = in.read(bytes)) != -1) {
                    out.write(bytes, 0, readCount);
                }
                //刷新
                out.flush();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                if (out != null) {
                    try {
                        out.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                if (in != null) {
                    try {
                        in.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }

                }
            }
            return;
        }
        //获取源下面的子目录
        File[] files = srcFile.listFiles();
        for (File file : files) {
            //获取所有文件的（包括目录和文件）绝对路径
            //System.out.println(file.getAbsolutePath());
            if (file.isDirectory()) {
                //新建对应的目录
                //System.out.println(file.getAbsolutePath());
                //F:\idea\Demo_01\src\BigDecimal   源目录
                //C:\idea\Demo_01\src\BigDecimal   目标目录
                String srcDir = file.getAbsolutePath();
                String desDir = (destFile.getAbsolutePath().endsWith("\\") ? destFile.getAbsolutePath() : destFile.getAbsolutePath() + "\\") + srcDir.substring(3);
                //System.out.println(desDir);
                File newFile = new File(desDir);
                if (!newFile.exists()) {
                    newFile.mkdirs();
                }

            }
            //递归调用
            copyDir(file, destFile);
        }

    }
}
