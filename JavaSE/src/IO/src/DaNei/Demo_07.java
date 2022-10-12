package IO.src.DaNei;

import loveBatian.GRobot;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 *
 * @Date: 2022/09/18/15:37
 * @Description:
 */
@SuppressWarnings("all")
public class Demo_07 {
    public static void main(String[] args) {
        int fraction = 0;
        GRobot gRobot = new GRobot();
        String[] word = {"setLocation","setVisible","setAutoRefresh","GRobot","setAutoTimer","GFrame"};
        String[]translate = {"设置坐标","设置显示","设置自动刷新","G型罗伯特","设置自动运行时间","G型界面机器人"};
        for (int i = 0; i <150 ; i++) {
            int n =  gRobot.getInt(0,5);
            gRobot.print("请输入"+word[n]+" ---  "+translate[n]);
            Scanner scanner = new Scanner(System.in);
            String user = scanner.next();
            if (user.equals(word[n])){
                fraction++;
            }else {
                fraction--;
            }
            gRobot.print("当前分数："+fraction);
        }


    }
}
