package DaNei;

import robot.SuperRobot;

/**
 * Created with IntelliJ IDEA.
 *
 * @Date: 2022/09/19/16:54
 * @Description:
 */
public class Demo_14 {
   SuperRobot superRobot =  new SuperRobot();
   public void k(){
       superRobot.speech(100,5,"要用力");
   }
    public void x(){
        superRobot.speech(100,5,"ctrl+1");
    }
    public void y(){
        superRobot.speech(100,5,"扯电源");
    }
    public void z(){
        superRobot.speech(100,5,"要用力");
    }
}
class Test01{
    public static void main(String[] args) {
        new Demo_14().k();
    }
}
