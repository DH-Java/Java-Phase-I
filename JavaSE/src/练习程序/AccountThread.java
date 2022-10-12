package 练习程序;

public class AccountThread implements Runnable{
    //两个线程必须共享同一个账户对象
    private Account act;
    //通过构造方法
    public AccountThread(Account act) {
        this.act = act;
    }
    public void run(){
        //多线程并发执行这个方法。
        act.Withdrawal(5000);
        System.out.println(Thread.currentThread().getName()+"对："+act.getName()+"取款成功,余额"+act.getBalance());
    }
}
