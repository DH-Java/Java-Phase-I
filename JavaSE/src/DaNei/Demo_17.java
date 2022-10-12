package DaNei;

import loveBatian.GFrame;
import loveBatian.GRobot;

import java.awt.*;
import java.awt.image.BufferedImage;

/**
 * Created with IntelliJ IDEA.
 *
 * @Date: 2022/09/20/11:35
 * @Description:
 */
public class Demo_17 extends GFrame {
    private GRobot gRobot;
    BufferedImage image = null;
    public static void main(String[] args) {
        new Demo_17().启动();
    }
    @Override
    public void 启动() {
        setSize(1000,800);
        setAutoRefresh(20);
        setVisible(true);
        while (true){
            image = gRobot.createScreenPicture(0, 0, 1400, 900);
        }

    }

    @Override
    public void 绘制(Graphics graphics) {
        graphics.drawImage(image,0,0,1000,800,null);
    }

    @Override
    public void 自动执行() {

    }

    @Override
    public void 键盘按下(int i) {

    }

    @Override
    public void 鼠标滑动(int i, int i1) {

    }
}
