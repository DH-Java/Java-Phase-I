package day4Java数组和其他类;

public class day3toString {
    public static void main(String[] args) {
        MyTime m = new MyTime(2002,9,3);

        String s = m.toString();
        //MyTime类重写toString方法之前
        System.out.println(s);//地址
        //MyTime类重写toString方法之后
        System.out.println(s);//2002年9月3日
        System.out.println(m.toString());
        System.out.println(m);
    }
    /*
    * toString源代码：
    * public String toString（）{
    * return this.getClass().getName() + "@" + Integer.toHexString(hashCode());
    * }
    * 源代码上toString（）方法的默认实现是：
    * 类名@对象的内存地址转换为十六进制的形式
    * toString的目的是什么？
    * toString（）方法的目的是:通过调用这个方法可以将一个“java对象”转换成“字符串表示形式”
    *
    * */
}
class MyTime{
    private int year;
    private int month;
    private int day;

    public MyTime() {
    }

    public MyTime(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }
    //重写toString（）方法
    //这个toString（）方法怎么重写？
    public String toString(){
        return this.year + "年" + this.month+"月" + this.day+"日";
    }
}

