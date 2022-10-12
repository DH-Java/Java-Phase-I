package IO.src.Thread;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

//定时器
public class  TimerTest {
    public static void main(String[] args) throws Exception{
        //创建定时对象
        Timer timer = new Timer();
        //Timer timer = new Timer(true);守护线程的方式
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//更改日期格式
        Date firstTime = sdf.parse("2021-08-30 09:47:20");//从字符串中解析文本以产生一个 Date
        timer.schedule(new LogTimerTask(),firstTime,1000*5);
        //timer.schedule(定时任务，第一次执行时间，间隔多久执行一次);
    }
}

class LogTimerTask extends TimerTask{

    @Override
    public void run() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String first = sdf.format(new Date());//将给定的 Date为日期/时间字符串
        System.out.println(first+"备份完成");
    }
}
