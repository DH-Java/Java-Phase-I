package com.dx.Algorithm;

import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 *
 * @author 67636
 * @Date: 2022/09/22/11:20
 * @Description: 二分法查找
 */
public class binarySearch {
    public static void main(String[] args) {
        int[] arr = new int[128];
        for (int i = 0; i < 128; i++) {
            arr[i] = i;
        }
        //一维数组

        Arrays.sort(arr);
        for (int num : arr) {
            System.out.print(num);
            System.out.print(" ");
        }
        System.out.println("");
        int search = new binarySearch().Search(arr, 127);
        if (search==-1){
            System.out.println("该数组中没有这个值");
        }else {
            System.out.println(search);
        }
    }

    /**
     * @Description:二分法查找
     * @param: [public]
     * @Param: [arr, item]
     * @return: [int[], int]
     * @Date: 2022/9/22
     */
    //静态方法
    public int Search(int[] arr, int item) {
        int flag = -1;
        //数组第一位
        int low = 0;
        //数组的长度
        int high = (arr.length - 1);
        // while死循环直到找到这个值
        while (low<=high) {
            //取数组中间下标
            int mid = (low + high) / 2;
            //如果中间下标等于你想要查找的那个值就直接返回
            if (item == arr[mid]) {
                return mid;
                //如果你要找的那个值小于数组中间值
            } else if (item < arr[mid]) {
                //从0到数组中间值中查找
                high = mid - 1;
            } else {
                //如果你查找的值大于数组中间值，那就从中间到最后值的区间中查找
                low = mid + 1;
            }

        }
        return flag;

    }
}

