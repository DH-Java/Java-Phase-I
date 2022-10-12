package reflect.可变长度参数;
/*
* 1、可变长度参数要求的参数个数是：0~n个
* 2、可变长度参数在参数列表中必须在最后一个位置上，而且可变长度参数只能有一个。
* 3、可变长度参数可以当作一个数组来看待
* */
public class ArgsTest {
    public static void main(String[] args) {
        m(1,2,3,4);
        m1("1","邓豪","邓杰","邓娟");

    }
    public static void m(int...args){
        System.out.println("可变长度参数="+args);
    }
    public static void m1(String name , Object...args){
        //args有length属性，说明args是一个数组！
        //可以将可变长度参数当作一个数组来看
        for (int i = 0; i<args.length;i++){
            System.out.println(args[i]);
        }
    }
    //必须最后一个且只能有一个
//    public static void m2(int...args , int...args1){
//
//    }
}
