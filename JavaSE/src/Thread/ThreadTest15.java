package Thread;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

//实现线程的第三种方式，实现Callable接口
//效率较低
public class ThreadTest15 {
    public static void main(String[] args) throws Exception {
        //创建一个未来任务类
        FutureTask futureTask = new FutureTask(new Callable() {
            @Override
            public Object call() throws Exception {//和run方法差不多，但是这个是有返回值的
                System.out.println("Callable begin");
                Thread.sleep(5000);
                System.out.println("Callable end");
                 int a = 100;
                 int b = 200;
                 return a+b;//自动装箱。自动转换成Integer.
            }
        });
        //创建线程对象
        Thread t = new Thread(futureTask);
        t.setDaemon(true);
        //启动线程
        t.start();
        //在主线程中。怎么获取t线程的返回结果
        //get()方法的执行会阻塞当前线程
        Thread.sleep(5000);
        Object o = futureTask.get();
        System.out.println("线程执行结果"+o);
        //main这里的程序想要执行，必须等get()方法执行完才能执行
        //因为get()方法是为了拿到另一个线程的执行结果，另一个线程执行完需要时间。
        System.out.println("Hello world");
    }
}
