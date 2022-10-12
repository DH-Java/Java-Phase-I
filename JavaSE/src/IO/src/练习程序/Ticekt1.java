package IO.src.练习程序;

public class Ticekt1 extends Thread {
    private Ticket tc;

    public Ticekt1(Ticket tc) {
        this.tc = tc;
    }
    public void run(){
        tc.maiPiao(50);
        System.out.println(Thread.currentThread().getName()+"对"+tc.getName()+"购票,购票完成剩余"+tc.getNumber());
    }
}
