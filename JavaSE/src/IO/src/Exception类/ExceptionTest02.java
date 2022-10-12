package IO.src.Exception类;
//处理异常的第一种方式：在方法声明的位置上使用
//异常对象有两个非常重要的方法：
//获取异常简单的描述信息
//String msg = exception.getMessage();
//打印异常追踪的堆栈信息；
//exception.printStackTrace();
public class ExceptionTest02 {
    public static void main(String[] args) {
        NullPointerException nullPointerException = new NullPointerException("空指针异常");
        String msg = nullPointerException.getMessage();
        System.out.println(msg);

        //打印异常堆信息
        nullPointerException.printStackTrace();
        System.out.println("Hello Word");


    }

}
