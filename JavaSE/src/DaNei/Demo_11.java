package DaNei;

import loveBatian.GRobot;
import loveBatian.GServer;

import java.io.IOException;
import java.net.ServerSocket;

/**
 * Created with IntelliJ IDEA.
 *
 * @Date: 2022/09/19/14:48
 * @Description:
 */
public class Demo_11 {
    public static void main(String[] args) throws IOException {
        GServer gs = new GServer(8888);
        GRobot gr = new GRobot();
        while (true){
            gr.print("请输入命令");
            String msg = gr.输入字符串();
            gs.发送(msg);
        }
    }

}
