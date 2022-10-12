package IO.src.Thread;
/*
* 分析一下有几个线程，除了垃圾回收器之外，有几个线程。1个线程。主线程main
* */
public class ThreadTest01 {
    public static void main(String[] args) {
        System.out.println("main begin");
        m1();
        System.out.println("main over");

    }
    public static void m1(){
        System.out.println("m1 begin");
        m2();
        System.out.println("m1 over");
    }
    public static void m2(){
        System.out.println("m2 begin");
        m3();
        System.out.println("m2 over");
    }
    public static void m3(){
        System.out.println("m3 execute");
    }
}
