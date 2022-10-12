package IO.src.day4Java数组和其他类;
//冒泡排序法
public class BubbleSort {
     public static void main(String[] args) {
          int [] arr = {3,2,5,4,6,7,1};
          //7条数据循环6次
         /* for (int i = 0; i <arr.length-1 ; i++) {
               System.out.println(i);
          }*/
          //int count = 0;
          for (int i =arr.length-1; i >0 ; i--) {
               for (int j = 0; j <i ; j++) {
                    //count++;
                    if (arr[j] > arr[j+1]){
                         //交换位置。
                         //arr[j] 和 arr[j+1]
                         int temp;
                         temp = arr[j];
                         arr[j]=arr[j+1];
                         arr[j+1]=temp;
                    }

               }

          }
          //System.out.println("比较次数："+ count);
          for (int i = 0; i <arr.length ; i++) {
               System.out.println(arr[i]);
          }
     }



}
