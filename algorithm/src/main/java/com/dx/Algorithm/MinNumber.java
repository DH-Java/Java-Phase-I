package com.dx.Algorithm;

/**
 * Created with IntelliJ IDEA.
 *
 * @author 67636
 * @Date: 2022/09/24/9:31
 * @Description:选择排序算法
 */
@SuppressWarnings("all")
public class MinNumber {
    public static void main(String[] args) {
        int[] arr = {3, 2, 0, 55, 7, 77, 8, 99, 44, 1};
//        int number = MinNumber.minNumber(arr);
//        System.out.println(arr[number]);
          System.out.println("===选择排序===");
//        MinNumber.minNumber1(arr);
//        for (int num : arr) {
//            System.out.println(num);
//        }
        selectionSerch(arr);
        for (int num : arr) {
            System.out.println(num);
        }
    }

    /**
     * @Description:获取数组中最小值的下标
     * @Param: [arr]
     * @return: [int[]]
     * @Date: 2022/9/24
     */
    public static int minNumber(int[] arr) {
        int minnumber = arr[0];
        int minindex = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < minnumber) {
                minnumber = arr[i];
                minindex = i;
            }
        }
        return minindex;
    }

    /**
     * @Description:选择排序算法 简陋版本
     * @Param: [arr]
     * @return: [int[]]
     * @Date: 2022/9/24
     */
    public static void minNumber1(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int index = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[i]) {
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;

                }
            }
        }

    }

    /**
     * @Description: 选择排序算法
     * @Param: [arr]
     * @return: [int[]]
     * @Date: 2022/9/27
     */
    public static void selectionSerch(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            if (i != minIndex) {
                int temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;

            }

        }
    }
}
