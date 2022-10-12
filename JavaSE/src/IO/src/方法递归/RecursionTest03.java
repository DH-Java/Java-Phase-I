package IO.src.方法递归;
/*
* 使用递归计算1~N的求和
*       -->1+2+3+4
*       -->4+3+2+1  :n的最初值是4，建议采用这种方式。
* */
public class RecursionTest03 {
    public static void main(String[] args) {

        System.out.println(Num(4));
    }

    public static int Num(int n) {
        if (n == 1) {
            return 1;
        }
        return n + Num(n - 1);
    }
}

