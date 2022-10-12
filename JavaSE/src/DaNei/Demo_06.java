package DaNei;

import app.JavaX;
import loveBatian.GRobot;

/**
 * Created with IntelliJ IDEA.
 *
 * @Date: 2022/09/18/14:39
 * @Description:
 */
public class Demo_06 {
    public static void main(String[] args) {
        String[] names = {"二狗","铁柱","玛莉","添狗","淑芬","大春","艾玛","爱坤","沙雕"};
        GRobot gRobot = new GRobot();
        while (true){
            int anInt = gRobot.getInt(0, 8);
            System.out.println("请输入你的姓");
            String s = gRobot.输入字符串();
            String name =s + names[anInt];
            System.out.println(name);

        }

    }
}
