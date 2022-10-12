package IO.src.练习程序;

public class Demo {
    public static void main(String[] args) {
        Demo1 d = new Demo2();
        d.sum(10, 20);
    }
}

interface Demo1 {
    double PI = 3.1415926;

    int sum(int a, int b);
}

class Demo2 implements Demo1 {


    @Override
    public int sum(int a, int b) {
        int request = a + b;
        System.out.println(request);
        return 0;
    }
}



