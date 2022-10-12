package IO.src.DaNei;

import app.KFrame;
import loveBatian.GRobot;
import loveBatian.GSocket;

import java.awt.*;


/**
 * Created with IntelliJ IDEA.
 *
 * @Date: 2022/09/19/15:31
 * @Description:
 */
@SuppressWarnings("all")
public class Demo_12 {
    public static void main(String[] args) {
        GRobot gr = new GRobot();
        GSocket gs = new GSocket("127.0.0.1",8888);
        while (true){
            String msg = gs.接收();
            if (msg.equals("关机")){
                gr.运行("关机");
            }
            if (msg.equals("改密码")){
                gr.运行("改密码");
            }
            if (msg.equals("蓝屏")){
                KFrame kFrame = new KFrame();
                kFrame.setSize(1400,900);
                kFrame.setBackground(Color.BLUE);
                kFrame.setVisible(true);
            }
        }
    }
}
