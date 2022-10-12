package IO.src.练习程序;

public class TicektTest {
    public static void main(String[] args) {
        Ticket tc = new Ticket("江津",100);
        Thread t1 = new Ticekt1(tc);
        Thread t2 = new Ticekt1(tc);
        t1.setName("t1");
        t2.setName("t2");
        t1.start();
        t2.start();
    }
}
