package Date;

/*
 * 获取自1970年1月1日 00：00：00 000到当前系统时间的总毫秒数。
 *
 * System.out[out是System类的静态变量]
 * System.out.println()【println（）方法不是System类的，是PrintStream类的方法】
 * System.gc()  建议启动垃圾回收器
 * System.currentTimeMillis()  获取自1970年1月1日 00：00：00 000到当前系统时间的总毫秒数。
 * System.exit(0) 退出JVM
 * */
public class DateTest02 {
    public static void main(String[] args) {
        //获取自1970年1月1日 00：00：00 000到当前系统时间的总毫秒数。
        long nowTime = System.currentTimeMillis();
        System.out.println(nowTime);
        System.out.println(nowTime / 1000 / 3600 / 24 / 365);

        //统计一个方法耗时
        //再调用目标方法之前记录一个毫秒数
        long begin = System.currentTimeMillis();
        print();
        //在执行目标方法之后记录一个毫秒数
        long end = System.currentTimeMillis();
        System.out.println(end - begin);
    }

    //统计一个方法执行所耗费的时长
    public static void print() {
        for (int i = 0; i < 10000; i++) {
            System.out.println("i = " + i);
        }
    }

}
