package Thread;
/*
* 怎么获取当前线程对象？
* static Thread currentThread()
* 获取线程对象的名字？
* 线程对象.getName（）
* 修改线程对象的名字？、
* 线程对象.setName()
*
* */
public class ThreadTest05 {
    public static void main(String[] args) {
        //currentThread就是当前线程对象
        //这个代码出现在main方法中，所以当前线程就是主线程。
        Thread currentThread = Thread.currentThread();
        System.out.println(currentThread.getName());
        MyThread1 t = new MyThread1();
        t.setName("杰哥是傻逼");
        String s = t.getName();
        System.out.println(s);
        t.start();
    }
}
class MyThread1 extends Thread{
    public void run(){
        for (int i = 0; i <100 ; i++) {
            Thread c= Thread.currentThread();
            System.out.println(c.getName()+"分支线程"+i);
        }
    }
}
