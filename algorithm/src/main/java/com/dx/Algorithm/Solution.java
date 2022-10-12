package com.dx.Algorithm;

import java.util.*;

/**
 * Created with IntelliJ IDEA.
 * 描述
 * 给定一个整数数组，查找数组是否包含任何重复项。 如果数组中某个值至少出现两次，则函数应返回true，如果每个元素都是不同的，则返回false。
 *
 * @Date: 2022/03/31/1:05
 * @Description:
 */
public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] arr = {2, 7, 11, 15};
        boolean flag = solution.containsDuplicate(arr);
        System.out.println(flag);
        System.out.println("=============");
        System.out.println(Arrays.toString(solution.twoSum(arr, 13)));
    }
    /**
     * @Description:
     * @Param: [nums]
     * @return: [int[]]
     * @Date: 2022/3/31
     */
    /**
     * +
     *
     * @param nums: the given array
     * @return: if any value appears at least twice in the array
     */
    public boolean containsDuplicate(int[] nums) {
        // Write your code here
        Set<Integer> hashSet = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (!hashSet.add(nums[i])) {
                return true;
            }
        }
        return false;
    }

    /**
     * @Description:两数之和
     * @Param: [nums, target]
     * @return: [int[], int]
     * @Date: 2022/4/20
     */
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i <nums.length;i++ ){
            if (map.containsKey(target-nums[i])){
                return new int[]{map.get(target-nums[i]),i};
            }
            map.put(nums[i],i);
        }
        return new int[0];
    }
}


