package IO.src.Thread;
//守护线程
public class ThreadTest14 {
    public static void main(String[] args) {
        Thread t = new MyDate();
        t.setName("备份数据");
        t.setDaemon(true);//启动线程之前，将线程设为守护线程。
        t.start();

        for (int i = 0; i <10 ; i++) {
            System.out.println(Thread.currentThread().getName()+i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class MyDate extends Thread{
    int i = 0;
    public void run(){
        while (true){//即使是死循环，但线程是守护线程，用户线程执行完，守护线程自动终止。
            System.out.println(Thread.currentThread().getName()+"--------"+(++i));
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
