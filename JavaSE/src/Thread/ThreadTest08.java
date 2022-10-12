package Thread;
/*
* sleep睡眠太久了，如果希望半道上醒来，你应该怎么办？也就是怎么叫醒一个正在睡眠的线程？
*       注意：这个不是中断线程的执行，是终止线程的睡眠
* */
public class ThreadTest08 {
    public static void main(String[] args) {
        Thread t = new Thread(new MyRunnable2());
        t.setName("傻逼杰");
        t.start();

        //希望5秒后线程醒来
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //中断分支线程的睡眠。这种中断睡眠的方式依靠java的异常处理机制。
        t.interrupt();//干扰
    }
}
class MyRunnable2 implements Runnable{
        //重点：run（）当中的异常不能throws，只能try catch
        //因为run方法中在父类没有抛出任何异常，子类不能比父类抛出更多的异常
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+"---->begin");
        //睡眠一年
        try {
            Thread.sleep(1000*60*60*24*365);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //一年之后才会执行在这
        System.out.println(Thread.currentThread().getName()+"---->end");
    }
}
