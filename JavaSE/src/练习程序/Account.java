package 练习程序;

//使用线程同步机制，线程不并发会出现线程安全问题。
public class Account {
    private String name;
    private double balance;

    public Account() {
    }

    public Account(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    //取款方法
    public void Withdrawal(double money) {
        //不使用线程同步，线程高并发会出现安全问题。
        /*以下代码执行的原理？
         * 1假设t1和t2线程并发，开始执行以下代码的时候，肯定有一个先一个后。
         * 2假设t1先执行了，遇到synchronized，这个时候自动找”后面共享对象“的对象锁，
         * 找到之后，并占有这把锁，然后执行同步代码块中的程序，在程序执行过程中一直都是占有这把锁的。直到同步代码块结束，这把锁才会释放。
         * 3假设t1已经占有这把锁了，此时t2也遇到synchronized关键字，也会去占有后面共享对象的这把锁，结果这把锁被t1占有，t2只能在同步代码块外面等待t1的结束，直到t1
         * 把同步代码块执行结束了，t1会归还这把锁，此时t2终于等到这把锁，然后t2占有这把锁之后，进入同步代码块执行程序。
         *
         * 这样就达到了线程排队执行。
         * 这里需要注意的是：这个共享对象一定要选好了，这个共享对象一定是你需要排队执行的这些线程对象所共享的。
         * */
        synchronized (this) {//线程同步代码块（）括号中要写多线程共享的对象
            //取款之前的余额
            double before = this.getBalance();
            //取款之后的余额
            double after = before - money;
            //模拟一下网络延迟
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            //更新余额
            this.setBalance(after);
        }

    }
}
