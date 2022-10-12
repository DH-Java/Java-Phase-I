package Thread;
//线程合并void join()
public class ThreadTest11 {
    public static void main(String[] args) {
        Thread c = Thread.currentThread();
        System.out.println("main begin");
        MyRunnable7 r = new MyRunnable7();
        Thread t = new Thread(r);
        t.setName("t");
        t.start();

        try {
            t.join();//当前线程进入阻塞，t线程结束，当前线程才可以继续执行。
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        for (int i = 0; i <10 ; i++) {
            System.out.println(c.getName()+c.getPriority()+i);
        }
        System.out.println("main  end");
        r.run = false;
    }
}
class MyRunnable7 implements Runnable{
    boolean run = true;
    @Override
    public void run() {
        if (run){
        for (int i = 0; i <10 ; i++) {
            System.out.println(Thread.currentThread().getName()+Thread.currentThread().getPriority()+i);
        }
        }else {
            return;
        }

    }
}
