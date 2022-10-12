package Date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTest01 {
    public static void main(String[] args) throws Exception {
        Date nowTime = new Date();
        System.out.println(nowTime);

        //将日期date，按照指定格式转换
        //SimpleDateFormat是Java.text包下的，专门负责日期格式化的
        /*
        yyyy 年
        MM  月
        dd  日
        HH  时
        mm  分
        ss  秒
        SSS  毫秒
        注意：在日期格式中，除了y M d h m s S 这些字符不能随便写之外，剩下的符号格式自己随便组织。
        * */
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy.MM.dd GGG hh:mm aaa");
        String nowTimeStr = simpleDateFormat.format(nowTime);
        System.out.println(nowTimeStr);
        //String-->Date
        String time = "2021-8-7 08:08:08 888";
        SimpleDateFormat simpleDateFormat1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");
        Date date = simpleDateFormat1.parse(time);
        System.out.println(date);
    }

}

