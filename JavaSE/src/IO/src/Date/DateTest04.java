package IO.src.Date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTest04 {
    public static void main(String[] args) {
        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:SS:ss");
        String format = simpleDateFormat.format(date);
        System.out.println(format);
    }
}
