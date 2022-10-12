package Thread;

public class ThreadTest07 {
    public static void main(String[] args) {
        Thread t = new MyThread3();
        t.setName("tttt");
        t.start();
        try {//这行代码会让线程进入休眠状态吗？
            Thread.sleep(5000);//在执行的时候还是会转换成：Thread.sleep(5000)；
                                      //这行代码的作用是:让当前线程进入休眠，也就是说main线程进入休眠。
                                      //这样代码出现在main方法中，main线程睡眠。
            System.out.println("Hello World");
        } catch (InterruptedException e) {
            e.printStackTrace();

        }
        System.out.println("5秒钟");
    }
}
class MyThread3 extends Thread{
    public void run(){
        for (int i = 0; i <12; i++) {
            System.out.println(Thread.currentThread().getName()+i);
        }
    }
}