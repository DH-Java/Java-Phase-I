package IO.src.DaNei;

import loveBatian.GFrame;

import java.awt.*;


/**
 * Created with IntelliJ IDEA.
 *
 * @author 67636
 * @Date: 2022/09/20/9:59
 * @Description:
 */
@SuppressWarnings("all")
public class Demo_15 extends GFrame {
    int eyes = 20;
    public static void main(String[] args) {
        Demo_15 demo_15 = new Demo_15();
        demo_15.启动();

    }

    @Override
    public void 启动() {
        setSize(500,500);
        setAutoTimer(20);
        setAutoRefresh(20);
        setVisible(true);
    }

    @Override
    public void 绘制(Graphics graphics) {
        graphics.fillOval(450,100,220,300);
        graphics.setColor(Color.ORANGE);
        graphics.fillOval(500,190,40,eyes);
        graphics.fillOval(570,190,40,eyes);
        graphics.fillRect(550,30,10,100);
        graphics.fillRect(530,300,50,40);
    }
    int a = 0;
    @Override
    public void 自动执行() {

        while (true){
            if (a== 0){
                eyes =20;
                a=1;
            }else if (a ==1){
                eyes = 10;
                a =0;
            }
        }


    }

    @Override
    public void 键盘按下(int i) {

    }

    @Override
    public void 鼠标滑动(int i, int i1) {

    }
}
