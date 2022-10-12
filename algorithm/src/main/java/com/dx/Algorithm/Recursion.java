package com.dx.Algorithm;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @author 676366223
 * @Date: 2022/09/24/14:19
 * @Description:
 */
public class Recursion {
    public static void main(String[] args) {
        System.out.println(factorial(5));
        int[] arr = {2,4,6};
        System.out.println(factorial1(arr, 0));


    }

    public static int factorial(int num){
        if (num == 1) {
            return 1;
        }

       return  num * factorial(num-1);
    }

    public static int factorial1(int[] arr, int n){
        int i = arr[n];
        n++;
        if (arr.length == n){
            return 0;
        }

        return i+=factorial1(arr,n);
    }
}
