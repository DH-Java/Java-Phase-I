package day4Java数组和其他类;

import java.io.Console;
import java.util.Scanner;

//数组元素查找
//一个一个挨着找
public class ArraySearch {
    public static void main(String[] args)throws NullPointerException {
        Scanner scanner = new Scanner(System.in);
        Console console = System.console();
        System.out.println("请输入用户名");
        String nextInt = scanner.nextLine();

        String str = console.readLine("用户名：",nextInt);
        System.out.println("请输入密码");
        int i = scanner.nextInt();
        char[] password =console.readPassword("密码："+i);
        int [] arr = {4,5,6,87,8};

        //需要找出87的下标，如果没有返回-1；
        /*for (int i = 0; i <arr.length ; i++) {
            if (arr[i]==87){
                System.out.println(i);
                return;
            }
        }
        System.out.println("表示没有87");*/
        int index = arraySearch(arr,89);
        System.out.println(index == -1 ? "该元素不存在": + index);

    }
    private static int arraySearch(int[] arr, int ele) {
        for (int i = 0; i <arr.length ; i++) {
            if (ele == arr[i]){
                return i;
            }
        }
        return -1;

    }
}
