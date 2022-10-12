package IO.src.Exception类;

public class ExceptionTest05 {
    public static void main(String[] args) {


        //final是一个关键字。表示最终的。不可变。
        //final修饰的类无法继承，修饰的方法无法重写
        //final int i = 100;
        //i =200;

        //Finally也是一个关键字，和try联合使用，使在异常处理机制中
        //finally语句块的代码一定会实现。


        //finalize（）是Object类中的一个方法，作为方法名出现。
        //这个方法是由垃圾回收器Gc负责调用的。
        //所以finalize是标识符
        //Object obj;



        //自定义异常

    }
    //编译时异常
    public class MyException extends Exception{
        public MyException() {
        }

        public MyException(String message) {
            super(message);
        }
    }
    //运行时异常
    public class MyException1 extends RuntimeException{
        public MyException1() {
        }

        public MyException1(String message) {
            super(message);
        }
    }
}
