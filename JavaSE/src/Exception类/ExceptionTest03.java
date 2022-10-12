package Exception类;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionTest03 {
    public static void main(String[] args) {
                FileInputStream fileInputStream = null;
            try {
                //创建输入流文件
                fileInputStream = new FileInputStream("F:\\idea\\Demo_01\\user.java");
                //开始读文件

                //这里会出现空指针
                String s = null;
                //流使用完需要关闭。因为流是占用资源的
                fileInputStream.close();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }catch (NullPointerException e){
                e.printStackTrace();
            }finally {
                System.out.println("Hello Word");
                //流的关闭放在这里比较保险。
                //finally中的代码是一定会执行的
                if (fileInputStream!=null)
                    try {
                        fileInputStream.close();
                    }catch (IOException e){
                        e.printStackTrace();
                    }

            }

    }
}
