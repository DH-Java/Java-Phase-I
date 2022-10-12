package IO.src.day4Java数组和其他类;

public class day4finalize {
    public static void main(String[] args) {

        for (int i = 0; i <1000 ; i++) {
            Person p = new Person();
            p = null;
            System.gc();

        }
    }
    /*
    * 在object类中的源代码
    * protected void finalize （）throws Throwable{  }
    *finalize（）方法只有一个方法体，里面没有代码，而且这个方法是protected修饰的。
    * JVM的垃圾回收器负责调用这个方法。
    * 静态代码块的作用
    * static{
    *
    * }
    * 在类加载时执行，并且只执行一次。
    * */
}

class Person{
    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("即将被销毁");
    }
}
