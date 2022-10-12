package com.dx.Algorithm;

import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 *
 * @author 67636
 * @Date: 2022/09/27/11:05
 * @Description:
 */

/**
 * @author 67636
 * @Description:希尔排序
 * @Param:
 * @return:
 * @Date: 2022/9/27
 */
public class ShellSort {
    public static void main(String[] args) {
        int[] arr = {5, 3, 9, 12, 6, 1, 0, 2, 4, 11, 8, 10,7};
        shellSort(arr);
        System.out.println(Arrays.toString(arr));
    }


    public static void shellSort(int[] arr) {
        int d = arr.length;
        while (d > 1) {
            //使用希尔增量的方式,即每次折半
            d = d / 2;
            for (int x = 0; x < d; x++) {
                for (int i = x + d; i < arr.length; i = i + d) {
                    //折半的值赋值给temp
                    int temp = arr[i];
                    int j;
                    //用第一个数与折半的值比较，如果第一个数大于折半的值，然后j=j-d;
                    for (j = i - d; (j >= 0) && (arr[j] > temp); j = j - d) {
                        //就赋值给折半的值
                        arr[j + d] = arr[j];
                    }
                    //折半的值赋值给j+d;
                    arr[j + d] = temp;
                }
            }
        }
    }
}
