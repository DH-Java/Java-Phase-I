package IO.src.DaNei;

import app.JavaX;
import loveBatian.GFrame;

import java.awt.*;
import java.awt.image.BufferedImage;

/**
 * Created with IntelliJ IDEA.
 *
 * @author 67636
 * @Date: 2022/09/20/10:52
 * @Description:
 */
@SuppressWarnings("all")
public class Demo_16 extends GFrame {
    JavaX javaX = new JavaX();
    BufferedImage image = javaX.readImage("");
    public static void main(String[] args) {
        new Demo_16().启动();
    }

    @Override
    public void 启动() {
        setUndecorated(true);
        setBackground(new Color(0,0,0,0));
        setSize(200,200);
        setVisible(true);
    }

    @Override
    public void 绘制(Graphics graphics) {
        graphics.drawImage(image,0,0,200,200,null);
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
