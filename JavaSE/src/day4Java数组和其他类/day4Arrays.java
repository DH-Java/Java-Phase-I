package day4Java数组和其他类;

import java.util.Arrays;

public class day4Arrays {
    public static void main(String[] args) {
        int [] arr = {3,4,6,2,7,9};
        Arrays.sort(arr);
        for (int i = 0; i <arr.length ; i++) {
            System.out.println(arr[i]);
        }
        int index = Arrays.binarySearch(arr , 9);
        System.out.println(index ==-1 ?"" :+index);
    }
}
