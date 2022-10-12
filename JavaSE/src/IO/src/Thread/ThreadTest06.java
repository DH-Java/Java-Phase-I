package IO.src.Thread;
/*
*关于线程的sleep方法：
*       static void sleep(long millis)
*       1静态方法   Thread.sleep();
*       2参数是毫秒
*       3作用：让当前线程进入休眠，“进入阻塞状态”，放弃占有cpu时间片，让给其他线程使用。
*               这行代码出现在A线程中，A线程就会进入休眠。
*               这行代码出现在B线程中，B线程就会进入休眠。
*       4、Thread.sleep()方法，可以做到这种效果：
*           间隔特定的时间，去执行一段特定的代码，每隔多久执行一次。
* */
public class ThreadTest06 {
    public static void main(String[] args) {
       /* try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/
        //5秒后执行这里的代码
       // System.out.println("邓杰是猪");
        for (int i = 0; i <10 ; i++) {
            System.out.println(Thread.currentThread().getName()+"==="+i);
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
