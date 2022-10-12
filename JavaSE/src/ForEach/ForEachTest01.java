package ForEach;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

//JDK5.0之后推出一个新特性：叫做增强for循环，或者叫foreach
public class ForEachTest01 {
    public static void main(String[] args) {

        int [] arr = {40,6,64,144,146,1941};
        for (int i = 0; i <arr.length ; i++) {
            System.out.println(arr[i]);


        }
        //增强for（foreach）
        //缺点，没有下标。
        //语法如下
        //for（元素类型 变量名 ：数组或者集合）{}
        for (int data: arr
        ) {
            System.out.println(data);
        }
        System.out.println("=============================================");



    }
}
