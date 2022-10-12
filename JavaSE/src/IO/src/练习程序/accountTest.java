package IO.src.练习程序;

public class accountTest {
    public static void main(String[] args) {
        Account act = new Account("act-100",10000);
        Thread t1 = new Thread(new AccountThread(act));
        Thread t2 = new Thread(new AccountThread(act));
        t1.setName("t1");
        t2.setName("t2");
        t1.start();
        t2.start();
    }
}
