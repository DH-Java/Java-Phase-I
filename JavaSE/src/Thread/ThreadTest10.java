package Thread;

public class ThreadTest10 {
    public static void main(String[] args) throws InterruptedException {
        Thread a = Thread.currentThread();
        //Thread.currentThread().setName("邓杰是傻逼");
        //Thread.currentThread().setPriority(10);
        //System.out.println(Thread.currentThread().getName()+"线程优先级"+Thread.currentThread().getPriority());
       /* MyRunnable6 myRunnable6 = new MyRunnable6();
        Thread thread = new Thread(myRunnable6);*/
        MyRunnable6 m = new MyRunnable6();
        Thread t = new Thread(m);
        t.setName("t");
        t.start();
        Thread.sleep(5000);
        t.interrupt();
        Thread.currentThread().setPriority(10);


        for (int i = 0; i <10 ; i++) {
            System.out.println(Thread.currentThread().getName()+"线程优先级"+a.getPriority()+"数量"+i);
            Thread.sleep(5000);
        }
        m.run = false;
    }
}
class MyRunnable6 implements Runnable{
    boolean run = true;
    @Override
    public void run() {
        Thread b = Thread.currentThread();
        b.setPriority(8);

        for (int i = 0; i <10 ; i++) {
            try {
                Thread.sleep(11000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (i%2==0){
                Thread.yield();//让位
            }
            System.out.println(Thread.currentThread().getName()+"线程优先级"+b.getPriority()+"数量"+i);
        }
    }
}
