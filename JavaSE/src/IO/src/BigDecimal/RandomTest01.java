package IO.src.BigDecimal;

import java.util.Random;

//随机数
public class RandomTest01 {
    public static void main(String[] args) {
        Random random =new Random();
        int num = random.nextInt();
        System.out.println(num);

        //产生0-100的随机数
        //next翻译为：下一个int类型的数据是101，表示只取到100
        int num1 = random.nextInt(101);
        System.out.println(num1);

        int [] arr = new int [5];
        for (int i = 0; i <arr.length ; i++) {

            arr[i]=-1;
        }
        int index=0;
        while (index< arr.length){
            int num2 = random.nextInt(6);
            //判断如果arr这个数组中有没有这个num2，如果没有就放进去。
            if (!contains(arr,num2)){
                arr[index++] = num2;
            }
        }
        for (int i = 0; i <arr.length ; i++) {
            System.out.println(arr[i]);
        }
    }
    public static boolean contains(int [] arr , int key){
        //Arrays.sort(arr);
        //进行二分法查找
        //二分法查找的结果>=0说明这个元素找到了。
        //return Arrays.binarySearch(arr,key) >=0;
        for (int i = 0; i <arr.length ; i++) {
            if (arr[i] == key){
                return true;
            }
        }
        return false;
    }

}
