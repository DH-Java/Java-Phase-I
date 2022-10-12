package com.dx.Algorithm;

import java.util.Arrays;
import java.util.HashSet;

/**
 * Created with IntelliJ IDEA.
 * 给定n个元素的未排序数组，请查找元素k是否存在于数组中。
 * 在下面的编辑器中完成findnNumber函数，它有2个参数：
 * 1整数数组arr，表示该数组中的元素。
 * 2整数k，表示要在数组中搜索的元素。
 * 该函数必须返回true或false，以指示该元素是否存在于数组中
 *
 * @Date: 2022/03/31/17:25
 * @Description:
 */
public class Solution1 {
    public static void main(String[] args) {
        Solution1 solution1 = new Solution1();

        int[] arr = {12, 24, 35, 46, 58};

        boolean b = solution1.findNumber(arr, 1);

        System.out.println(b);

        int[] rounding = solution1.rounding(arr);

        for (int r : rounding) {
            System.out.println(r);
        }
    }

    /**
     * @param nums: a integer array
     * @param k:    a integer
     * @return: return true or false denoting if the element is present in the array or not
     */
    public boolean findNumber(int[] nums, int k) {
        boolean flag = false;
        // write your code here
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }
        if (!set.add(k)) {
            flag = true;
        }
        return flag;
    }

    /**
     * @Description: 本题我们要编写代码实现对数组 array 中的正整数按照个位四舍五入，如果是负数和零就不做任何处理，最后返回这个四舍五入后的数组
     * @Param: [array]
     * @return: [int[]]
     * @Date: 2022/3/31
     */
    public int[] rounding(int[] array) {

        int length = array.length;
        // 使用 for 循环遍历数组中的元素
        for (int i = 0; i < length; i++) {
            if (array[i] < 0) {
                continue;
            }
            // 判断数组中正整数的个位数是否大于等于 5
            if ((array[i] % 10) >= 5) {
                // 如果个位大于等于 5 则个位变零，十位进一
                array[i] = (array[i] + 10) - (array[i] % 10);
            } else {
                // 如果个位小于 5 则个位变零，十位不变
                array[i] = array[i] - (array[i] % 10);
            }
        }

        return array;
    }
}
