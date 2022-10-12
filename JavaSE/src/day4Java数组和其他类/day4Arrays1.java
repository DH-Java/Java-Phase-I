package day4Java数组和其他类;

import java.util.Arrays;

public class day4Arrays1 {
    public static void main(String[] args) {
        int [] arr = {2,51,1,53,56,432};
        Arrays.sort(arr);
        System.out.println();
        for (int i = 0; i <arr.length ; i++) {
            System.out.println(arr[i]);

        }
    }
}
