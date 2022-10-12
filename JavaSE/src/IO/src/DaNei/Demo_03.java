package IO.src.DaNei;

import loveBatian.GRobot;

/**
 * Created with IntelliJ IDEA.
 *
 * @Date: 2022/09/18/10:16
 * @Description:
 */
@SuppressWarnings("all")
public class Demo_03 {
    public static void main(String[] args) {
        //创建GRobot对象
        GRobot gRobot = new GRobot();
        //gRobot对象调用getInt方法获取1到10的随机数
        int anInt = gRobot.getInt(1, 10);
        while (true){
            //移动鼠标到随机坐标点
            gRobot.mouseMove(anInt,anInt);
        }
    }
}
