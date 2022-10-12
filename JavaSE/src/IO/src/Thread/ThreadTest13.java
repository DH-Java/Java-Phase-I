package IO.src.Thread;
//死锁
public class ThreadTest13 {
    public static void main(String[] args) {
        Object o1 = new Object();
        Object o2 = new Object();
        Thread t1 = new MyClass(o1,o2);
        Thread t2 = new MyClass1(o1,o2);
        t1.start();
        t2.start();
    }
}

class MyClass extends Thread{
    Object o1;
    Object o2;

    public MyClass(Object o1, Object o2) {
        this.o1 = o1;
        this.o2 = o2;
    }
    public void run(){
        synchronized (o1){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (o2){

            }
        }
    }
}

class MyClass1 extends Thread{
    Object o1;
    Object o2;
    public MyClass1(Object o1,Object o2){
        this.o1=o1;
        this.o2=o2;
    }
    public void run(){
        synchronized (o2){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (o1){

            }
        }
    }
}
