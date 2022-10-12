package IO.src.Thread;

public class ThreadTest04 {
    public static void main(String[] args) {

        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i <100 ; i++) {
                    System.out.println("t=="+i);
                }


            }
        });
        t.start();
        for (int i = 0; i <100 ; i++) {
            System.out.println("主线程"+i);
        }
    }
}
