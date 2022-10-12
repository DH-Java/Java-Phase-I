package day4Java数组和其他类;
//使用内部类编写的代码，可读性很差，能不用尽量不用。
//匿名内部类是局部内部类的一种。
public class day4内部类 {
    public static void main(String[] args) {
        day4内部类.Inner1.m1();
        day4内部类.Inner1 mi = new day4内部类.Inner1();
        mi.m2();
    }
    //该类在类的内部，所以称为内部类
    //由于前面有个static，所以称为”静态内部类“
    static class Inner1{
        public static void m1(){
            System.out.println("静态内部类的m1方法执行");
        }
        public void m2(){
            System.out.println("静态内部类中的实例方法执行");
        }

    }
    //该类在类的内部，所以称为”内部类“
    //没有static，所以称为实例内部类。
    class Inner2{}
    public void doSome(){
        //局部变量
        int i = 100;
        //该类在类的内部，所以称为”内部类“
        //局部内部类
        class Inner3{

        }
    }
    public void doOther(){

    }
}
