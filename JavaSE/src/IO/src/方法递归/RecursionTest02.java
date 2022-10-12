package IO.src.方法递归;
//不使用递归，计算1~N的和
public class RecursionTest02 {
    public static void main(String[] args) {
        //直接调用方法即可
        System.out.println(sum(4));
        System.out.println(sum(10));
    }

    //单独的定义一个方法，这是一个独立的功能，可以完成1~N的求和
    public static int sum(int n){
        int num = 0;
        for (int i = 1 ; i<=n ;i++){
            num += i;
        }
        return num;
    }
}
