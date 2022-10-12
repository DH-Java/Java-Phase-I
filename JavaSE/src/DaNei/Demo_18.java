package DaNei;

import app.JavaX;
import loveBatian.GFrame;
import loveBatian.GRobot;

import java.awt.*;
import java.io.File;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 *
 * @Date: 2022/09/20/14:25
 * @Description:
 */
public class Demo_18 {
    public static void main(String[] args) {
        GRobot gRobot = new GRobot();
        JavaX javaX = new JavaX();
        Scanner scanner = new Scanner(System.in);

        System.out.println("请输入你想看的电影");

        String address = "http://api.wpsseo.cn/?v="+scanner.next();

        String google ="C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe";

        gRobot.openWeb(google,address);

        File ma = gRobot.newFile("F:\\daily\\QQ\\Message\\676366223\\FileRecv\\girls\\mm\\阿玫er.png");
        javaX.qrCode(ma,address,500,500);
    }
}
