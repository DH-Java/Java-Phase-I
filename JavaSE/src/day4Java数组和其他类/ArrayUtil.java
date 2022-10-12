package day4Java数组和其他类;
//关于查找算法中的：二分法查找。
//二分法查找算法是基于排序的基础之上。（没有排序的数据是无法查找的）
//int [] arr ={10，11，12，13，14，15，16，17，18，19，20}查找18.
//从0+10/2=5这个下标开始，15<18说明被查找的元素在15的右边。然后至此的开始下标变成5+1=6
//6+10/2=8.arr[8]=18
public class ArrayUtil {
    public static void main(String[] args) {
        int [] arr = {100,200,300,400,500,600};
        int index = binarySearch(arr ,600);
        System.out.println(index ==-1 ? " ": + index);

    }
    //从数组中查找目标元素的下标
    //arr被查找的数组
    //dest目标元素

    private static int binarySearch(int[] arr, int dest) {
        //开始下标
        int begin = 0;
        //结束下标
        int end = arr.length-1;
        //开始的元素的下标只要在结束元素的下标左边，就有机会进行循环。
        while (begin<=end) {
            int mid = (begin + end) / 2;
            if (arr[mid] == dest) {
                return mid;

            } else if (arr[mid] < dest) {
                //目标在"中间"右边
                //开始元素下标需要发生变化（开始元素的下标需要重新赋值）
                begin = mid + 1;//一直增
            } else {
                //arr[mid]>dest
                //目标在“中间”的左边
                //修改结束元素的下标
                end = mid - 1;//一直减
            }
        }
        return -1;
    }

}
