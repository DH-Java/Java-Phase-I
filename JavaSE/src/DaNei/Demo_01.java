package DaNei;

import loveBatian.GRobot;

/**
 * Created with IntelliJ IDEA.
 *
 * @author 67636
 * @Date: 2022/09/18/9:33
 * @Description:
 */




/**
* @Description: 创建机器人对象  使用对象杀死进程
* @Param: GRbot
* @return: GRbot
* @Date: 2022/9/18
*/
@SuppressWarnings("all")
public class Demo_01 {
    public static void main(String[] args) {
        GRobot gRobot = new GRobot();
        int x = gRobot.getX();
        System.out.println(x);
        int y = gRobot.getY();
        System.out.println(y);
        while (true){
            gRobot.kill("QQ.exe");
        }
    }
}
