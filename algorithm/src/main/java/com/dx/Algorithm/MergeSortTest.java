package com.dx.Algorithm;

import java.util.Arrays;


/**
 * Created with IntelliJ IDEA.
 *
 * @author 67636
 * @Date: 2022/09/28/10:31
 * @Description:
 */
public class MergeSortTest {
    public static void main(String[] args) {
        int[] arr = {5,12,6,7,8,3,4,9};
        mergeSort(arr,0, arr.length-1);
        System.out.println(Arrays.toString(arr));

    }

    public static void mergeSort(int[] arr , int start , int end){
        if (start < end){
            int mid = (start + end)/2;
            mergeSort(arr,start,mid);
            mergeSort(arr,mid+1,end);
            merge(arr,start,mid,end);
        }

    }
    private static void merge(int[] arr , int start , int mid , int end){
        int[] nums = new int[end - start +1];
        int p1 = start;
        int p2 = mid +1;
        int p = 0;
        while ((p1<=mid)&&(p2<=end)){
            if (arr[p1] <= arr[p2]){
                nums[p++] = arr[p1++];
            }else {
                nums[p++] = arr[p2++];
            }
        }
        while (p1<=mid){
            nums[p++] = arr[p1++];
        }
        while (p2<=end){
            nums[p++] = arr[p2++];
        }
        for (int i = 0; i <nums.length ; i++) {
            arr[i+start] = nums[i];
        }
    }
}
