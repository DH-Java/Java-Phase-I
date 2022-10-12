package Date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTest03 {
    public static void main(String[] args) {
        //1970-01-01 00:00:00 001
        Date date = new Date(1);//参数是一个毫秒

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss sss");
        String string = simpleDateFormat.format(date);
        System.out.println(string);

        //获取昨天的此时的时间
        Date date1 = new Date(System.currentTimeMillis() - 1000 * 60 * 60 * 24);
        String string1 = simpleDateFormat.format(date1);
        System.out.println(string1);
    }
}
