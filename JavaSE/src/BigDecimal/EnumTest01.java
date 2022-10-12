package BigDecimal;

import java.util.Scanner;

/*
*枚举方法
* 枚举是一种引用数据类型
* enum 枚举类型名{
*       枚举值1 ，枚举值2
* }
* 结果超过两种并且可以一枚一枚列出来的，建议采用枚举。
* */
public class EnumTest01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        Result value = EnumTest01.divide(a,b);
        System.out.println(value);
    }

    /*
    *
    * */
    public static Result divide(int a , int b) {
        int c = 2;
        if (c == a / b) {
            System.out.println(c);
            return Result.SUCCESS;
        }else if(c !=a/b){

            System.out.println("去你妈的，哪有这样的");
            return Result.FAIL;
        }else if (c==3){
            return Result.RESULT;
        }else {
            return Result.RESULT;
        }



    }
    }
enum Result{
    //SUCCESS 是枚举Result类型中的一个值
    //FALI是枚举Result类型中的一个值
    //枚举中的每一个值，可以看做是”常量
    SUCCESS,FAIL,RESULT
}
