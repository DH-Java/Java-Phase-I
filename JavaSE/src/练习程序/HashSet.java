package 练习程序;

public class HashSet {

    public static void main(String[] args) {
        java.util.HashSet<Integer> hx = new java.util.HashSet<>();
        hx.add(null);
        hx.add(3);
        hx.add(451);
        hx.add(715);
        hx.add(1000);
        hx.add(6);
        hx.add(3);
        hx.add(null);
        System.out.println(hx.size());
        if (!hx.contains(6)) {
            hx.add(6);
        }
        System.out.println(hx.size());
        hx.remove(451);
        System.out.println(hx.size());
        System.out.println("============for循环遍历=============");
        for (Integer item : hx) {
            System.out.println(item);
        }

    /*        Demo1();
    }
    //Date类的空参数构造方法：
    // 就是获取当前系统的时间
    private static void Demo1(){
        Date data = new Date();
        System.out.println(data);*/
     /*  ArrayList<String> list = new ArrayList<String>();
       System.out.println(list);//向集合中添加一些数据，需要用到add
        list.add("邓杰");
        list.add("高圆圆");
        list.add("赵又廷");*/
 /*       System.out.println(list);
        //从集合中获取元素：get ，索引从0开始。
        String name = list.get(1);
        System.out.println(name);
//        从集合中删除元素。
        String name1 = list.remove(0);
        System.out.println(name1);
//        获取集合的长度
        int size = list.size();
        System.out.println(size);*/
/*        //遍历集合
        for (int i = 0; i <list.size() ; i++) {
            System.out.println(list.get(i));*/
        //按照默认升序（从小到大）对数组的元素进行排列。
       /* int [] Array = {1,5,7,0,2,4,6};
        Arrays.sort(Array);
        System.out.println(Arrays.toString(Array));*/
       /* ArrayList<String> list = new ArrayList<String>();
        list.add("邓杰");
        list.add("高圆圆");
        list.add("赵又廷");
        System.out.println(Math.random());
        System.out.println(Math.random());
        System.out.println(Math.random());
        System.out.println(Math.random());
        if (Math.random()>0){
            System.out.println(list);
        }/**/


    }
}


