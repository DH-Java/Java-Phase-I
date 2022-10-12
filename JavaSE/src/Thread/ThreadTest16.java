package Thread;

import java.util.ArrayList;
import java.util.List;
//wait方法：使当前对象中活动的线程无限期停止活动，直到被唤醒。
//notify方法：唤醒当前对象中沉睡的线程，直到被唤醒。
public class ThreadTest16 {
    public static void main(String[] args) {
        //创建一个ArrayList集合
     List list = new ArrayList();
     Thread t1 = new Thread(new OutPut(list));//t1和t2共用一个对象
     Thread t2 = new Thread(new InPut(list));
     t1.setName("生产者线程");
     t2.setName("消费者线程");
     t1.start();
     t2.start();
    }
}
class OutPut implements Runnable{
    private List list;//定义一个实列变量

    public OutPut(List list) {
        this.list = list;
    }

    @Override
    public void run() {
        while (true){
            synchronized (list){
                if (list.size()>0){
                    try {
                        list.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                Object o = new Object();
                list.add(o);
                System.out.println(Thread.currentThread().getName()+o);
                list.notify();
            }

        }


    }
}
class InPut implements Runnable{
    private List list;

    public InPut(List list) {
        this.list = list;
    }

    @Override
    public void run() {
        while (true){
            synchronized (list){
                if (list.size()==0){
                    try {
                        list.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                Object o = list.remove(0);
                System.out.println(Thread.currentThread().getName()+o);
                list.notify();
            }
        }

    }
}
