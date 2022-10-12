package IO.src.DaNei;

import loveBatian.GRobot;

import java.awt.event.KeyEvent;


/**
 * Created with IntelliJ IDEA.
 *
 * @Date: 2022/09/18/10:38
 * @Description:
 */
@SuppressWarnings("all")
public class Demo_04 {
    public static void main(String[] args) throws InterruptedException {
        Thread.sleep(500);
        GRobot gRobot = new GRobot();
        while (true){
            gRobot.onkeydown(17);
            gRobot.onkeydown(86);
            gRobot.onkeyup(17);
            gRobot.onkeyup(86);
            gRobot.onkeydown(KeyEvent.VK_ENTER);
            gRobot.onkeyup(KeyEvent.VK_ENTER);
            Thread.sleep(500);
        }

    }
}
