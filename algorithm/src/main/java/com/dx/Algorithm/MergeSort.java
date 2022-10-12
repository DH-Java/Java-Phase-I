package com.dx.Algorithm;

import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 *
 * @author 67636
 * @Date: 2022/09/28/9:02
 * @Description:归并排序
 */
public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {5, 8, 6, 3, 9, 2, 1, 7};
        mergeSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }


    public static void mergeSort(int[] arr, int start, int end) {
        if (start < end) {
            //折半成两个小集合，分别进行递归
            int mid = (start + end) / 2;
            mergeSort(arr, start, mid);
            mergeSort(arr, mid + 1, end);
            //把两个有序小集合，归并成一个大集合
            merge(arr, start, mid, end);
        }
    }

    private static void merge(int[] arr, int start, int mid, int end) {
        //开辟额外大集合，设置指针
        int[] arrays = new int[end - start + 1];
        int p1 = start;
        int p2 = mid + 1;
        int p = 0;
        //比较两个小集合的元素，依次放入大集合
        while ((p1 <= mid) && (p2 <= end)) {
            if (arr[p1] <= arr[p2]) {
                arrays[p++] = arr[p1++];
            } else {
                arrays[p++] = arr[p2++];
            }
        }
        //左侧小集合还有剩余，依次放入大集合尾部
        while (p1 <= mid) {
            arrays[p++] = arr[p1++];
        }
        //右侧小集合还有剩余，依次放入大集合尾部
        while (p2 <= end) {
            arrays[p++] = arr[p2++];
        }
        //把大集合的元素复制回原数组
        for (int i = 0; i < arrays.length; i++) {
            arr[i + start] = arrays[i];
        }
    }
}
