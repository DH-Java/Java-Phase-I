package DaNei;

import app.JavaX;
import loveBatian.GFrame;
import loveBatian.GRobot;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.util.Random;

/**
 * Created with IntelliJ IDEA.
 *
 * @author 67636
 * @Date: 2022/09/20/10:52
 * @Description:
 */

public class Demo_16 extends GFrame {
    private Random random;
    JavaX javaX = new JavaX();
    int x = random.nextInt(50);
    int y = random.nextInt(30);
    BufferedImage image = javaX.readImage("jetbrains://idea/navigate/reference?project=JavaSE&path=timg.png");
    public static void main(String[] args) {
        new Demo_16().启动();
    }


    @Override
    public void 启动() {

        setUndecorated(true);
        setBackground(new Color(0,0,0,0));
        setLocation(x,y);
        setSize(random.nextInt(40),random.nextInt(40));
        setAlwaysOnTop(true);
        setAutoTimer(20);
        setVisible(true);
    }

    @Override
    public void 绘制(Graphics graphics) {
        graphics.drawImage(image,0,0,200,200,null);
    }

    @Override
    public void 自动执行() {
        if (y>900){
            y=-200;
            y++;
        }
    }

    @Override
    public void 键盘按下(int i) {

    }

    @Override
    public void 鼠标滑动(int i, int i1) {

    }
}
