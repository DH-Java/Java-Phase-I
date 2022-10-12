package IO.src.day4Java数组和其他类;
/*
* java语言中数组是一种引用数据类型。不属于基本数据类型。数组的父类是Object。
* 数组实际上是一个容器，可以同时容纳多个元素。（数组是一个数据的集合）
*数组当中可以存储”基本数据类型“的数据，也可以存储”引用数据类型“的数据。
* 数组因为是引用数据类型，所以数组对象是堆内存当中。（数组是存储在堆当中的）
* 数组如果存储的是”Java对象“的话，实际上存储的对象的”引用“（内存地址）
* 数组一旦创建，在Java中规定，长度不可改变。（数组长度不可变）
* 数组的分类：一维数组，二维数组，三维数组，多维数组...（一维数组较多，二维数组偶尔使用！）
* 所有的数组都有length属性（Java自带的）用来获取数组中元素的个数。
* Java中的数组要求数组中元素的类型统一。
* 数组在内存方面存储的时候，数组中元素内存地址是连续的。
* 数组中首元素的内存地址作为整个数组对象的内存地址。
* 最后一个元素的下标是length-1.
* 数组的扩容（拷贝）
* System.arraycopy(第一个数组，从哪个元素开始拷贝，拷贝到那个数组，拷贝到后面数组的那个位置，拷贝的长度);
* 数组：
动态初始化数组的格式：数据类型 [] 数据名称 = new 数据类型 [数组长度]
静态初始化基本格式：数据类型 [] 数据名称 = new 数据类型 {元素1，元素2，元素3}
* new就是初始化。每个元素默认为null。
* */
public class day4Array {
    public static void main(String[] args) {
        int [] [] d =new int[3][2];
        for (int i = 0; i <d.length ; i++) {
            for (int j = 0; j <d[i].length ; j++) {
                System.out.print(d[i][j]);
                System.out.println("===================");


            }
        }
        int [] a = {1,22,33,44,5};
        int [] b = new int[20];
        System.arraycopy(a,1,b,2,3);
        for (int i = 0; i <b.length ; i++) {
            System.out.println(b[i]);
        }

//            int [] a = {1,23,4};
//        for (int i = 0; i <a.length ; i++) {
//            System.out.println(a[i]);
//        }
//        int [] c= {1,2,34,5};
//        Array(c);
//        Array(new int [9]);
        if (args.length != 2) {
            System.out.println("请输入用户名和密码");
            return;
        }
        String poss = args[0];
        String push = args[1];
        if ("denghao".equals(poss) && "123".equals(push)) {
            System.out.println("登陆成功");
        } else {
            System.out.println("用户名或者密码错误");
        }
    }
}
//    //静态方法不用new对象。
//    public static void Array(int [] b){
//        for (int i = 0; i <b.length ; i++) {
//            System.out.println(b[i]);
//        }
//    }

