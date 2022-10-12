package com.dx.Algorithm;

import java.util.Comparator;

/**
 * Created with IntelliJ IDEA.
 *
 * @author 67636
 * @Date: 2022/10/02/12:03
 * @Description:查找一组数据中最大的值或者最小的值
 */
@SuppressWarnings("all")
public class FindMaxDemo implements Comparator<Integer> {

    public static void main(String[] args) {
        String[] str = {"Joe", "Bob", "Bill", "Zeke"};
        Integer[] num = {2,4,6,7,8,1,55,66,31,88};
        System.out.println(findMax(num, new FindMaxDemo()));
        System.out.println(findMax(num));
        System.out.println(findMax(str));
    }

    /**
    * @Description: 在一个数组中找出最大元的泛型static方法
    * @Param: [arr]
    * @return: [AnyType[]]
    * @Date: 2022/10/2
    */
    public static<AnyType extends Comparable<? super AnyType>> AnyType findMax(AnyType[] arr) {
        int maxIndex = 0;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i].compareTo(arr[maxIndex]) > 0) {
                maxIndex = i;
            }

        }
        return arr[maxIndex];
    }

    public static <AnyType> AnyType findMax(AnyType[] arr , Comparator<?super AnyType> cmp){
        int maxIndex = 0;

        for (int i = 1; i < arr.length; i++) {
            if (cmp.compare(arr[i],arr[maxIndex])>0) {
                maxIndex = i;
            }

        }
        return arr[maxIndex];
    }
//比较字符串大小
//    @Override
//    public int compare(String o1, String o2) {
//        return o1.compareToIgnoreCase(o2);
//    }

    //比较数字大小
    @Override
    public int compare(Integer o1, Integer o2) {
        return o1.compareTo(o2);
    }
}
