package IO.src.day4Java数组和其他类;
//关键点：怎么找出一堆数据中最小的。
//选择排序算法
public class SelectSort {
    public static void main(String[] args) {
        int [] arr = {4,3,2,5,6,1};
        for (int i = 0; i <arr.length-1 ; i++) {
            int min = i;
            //System.out.println(i);
            for (int j =i+1; j <arr.length ; j++) {
                if (arr[j]<arr[min]){
                    min = j;
                }

            }
            if (min!=i){
                int temp;
                temp = arr[min];
                arr[min]=arr[i];
                arr[i]=temp;
            }
        }
        for (int i = 0; i <arr.length ; i++) {
            System.out.println(arr[i]);
        }
    }

}
