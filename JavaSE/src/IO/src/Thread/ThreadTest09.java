package IO.src.Thread;
//合理的终止代码
public class ThreadTest09 {
    public static void main(String[] args) {
        MyRunnable4 myRunnable4 = new MyRunnable4();
        Thread T = new Thread(myRunnable4);
        T.start();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //终止线程
        //你想要什么时候停止t的执行，那么把标记改为false，就结束了。
        myRunnable4.run = false;
    }
}

class MyRunnable4 implements Runnable{
    boolean run = true;
    @Override
    public void run() {
        for (int i = 0; i <10 ; i++) {
            if (run){
                System.out.println(Thread.currentThread().getName()+i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }else {
                //return就结束了，你在结束之前还有什么没保存的 。
                //在这里可以保存
                return;
            }

        }

    }
}
