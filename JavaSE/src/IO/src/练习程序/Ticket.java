package IO.src.练习程序;

public class Ticket {
    private String name;
    private int number;

    public Ticket() {
    }

    public Ticket(String name, int number) {
        this.name = name;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    //购票方法
    public void maiPiao(int number) {
        synchronized (this) {
            int before = this.getNumber();//起始数量
            int after = before - number;//剩余票
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            this.setNumber(after);
        }
    }
}
