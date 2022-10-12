package DaNei;

import app.KFrame;
import loveBatian.GRobot;

import java.awt.*;

/**
 * Created with IntelliJ IDEA.
 *
 * @Date: 2022/09/19/11:46
 * @Description:
 */
public class Demo_10 {
    public static void main(String[] args) throws InterruptedException {

        GRobot gRobot = new GRobot();
        while (true){
            int x = gRobot.getInt(0, 1440);
            int y = gRobot.getInt(0, 900);
            int w = gRobot.getInt(100,200 );
            int r = gRobot.getInt(0, 255);
            int g = gRobot.getInt(0, 255);
            int b = gRobot.getInt(0, 255);
            KFrame kFrame = new KFrame();
            kFrame.setAlwaysOnTop(true);
            kFrame.setUndecorated(true);
            kFrame.setSize(w,w);
            kFrame.setBackground(new Color(r,g,b));
            kFrame.setLocation(x,y);
            kFrame.setVisible(true);
            Thread.sleep(100);
        }
    }
}
