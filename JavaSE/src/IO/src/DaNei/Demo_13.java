package IO.src.DaNei;

import loveBatian.GRobot;

/**
 * Created with IntelliJ IDEA.
 *
 * @Date: 2022/09/19/16:33
 * @Description:
 */
public class Demo_13 {
    GRobot gRobot = new GRobot();
    public void shotDown(){

        gRobot.运行("shutdown -s");
    }
    public void note(){
        gRobot.运行("notepad");
    }
    public void number(){
        gRobot.运行("calc");
    }
}

class Test{
    public static void main(String[] args) {
        new Demo_13().note();

    }
}

