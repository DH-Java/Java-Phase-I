package IO.src.DaNei;

import java.awt.*;

/**
 * Created with IntelliJ IDEA.
 *
 * @Date: 2022/09/19/10:42
 * @Description:
 */
@SuppressWarnings("all")
public class Demo_09 {
    public static void main(String[] args) throws InterruptedException {
        Frame jFrame = new Frame();
        jFrame.setSize(1080,100);
        jFrame.setVisible(true);
        jFrame.setBackground(Color.BLUE);
        jFrame.setAlwaysOnTop(true);
        jFrame.setUndecorated(true);
        jFrame.setResizable(true);
        while (true){
            jFrame.setBackground(Color.YELLOW);
            Thread.sleep(200);
            jFrame.setBackground(Color.BLACK);
            Thread.sleep(200);
            jFrame.setBackground(Color.RED);
            Thread.sleep(200);
            jFrame.setBackground(Color.GREEN);
            Thread.sleep(200);
        }
    }
}
