package com.dx.Algorithm;

/**
 * Created with IntelliJ IDEA.
 *
 * @author 67636
 * @Date: 2022/09/27/9:44
 * @Description:插入排序
 */
public class InsertSort {
    public static void main(String[] args) {
        int[] arr = {5,8,6,3,9,2,1,7};
        insertSort(arr);
        for (int num:arr) {
            System.out.println(num);
        }
    }

    public static void insertSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int insertValue = arr[i];
            int j = i - 1;
            //从右向左比较元素的同时，进行元素复制
            for (; (j >= 0) && (insertValue < arr[j]); j--) {
                arr[j+1] = arr[j];
            }
            //insertValue的值插入适当位置
            arr[j+1] = insertValue;
        }
    }
}
