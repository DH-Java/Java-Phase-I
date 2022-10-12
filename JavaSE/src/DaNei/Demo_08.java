package DaNei;

import app.KFrame;
import loveBatian.GRobot;
import robot.SuperRobot;
import sky.Speech;

import java.util.Random;

/**
 * Created with IntelliJ IDEA.
 *
 * @Date: 2022/09/19/10:07
 * @Description:
 */
@SuppressWarnings("all")
public class Demo_08 {
    public static void main(String[] args) {
        Random random = new Random();
        String[] names = {"马文杰", "覃山", "刘宇恒", "黄俊宇", "张淼 ", "周锋 ", "张志鹏", "何自高 ", "王海帆 ", "陈星池 ", "石斌拴 ", "陈仲伦 ",
                "张浩然 ", "冯丽鑫 ", "杨洋 ", "昊冬冬 ", "戴志强 ", "代恩堃 ", "候海 ", "刘洋 ", "徐洋 ", "周倩 ", "刘兴菊 ", "喻丹丹 ", "冉宇涵 ",
                "袁帅 ", "胡高强 ", "谢金翔 ", "段云辉 ", "邓豪 ", "刘世鑫 ", "李超 ", "张广勇 ", "潘远寒 ", "彭程 ", "黄宇翔 ", "吉少辉 ", "曹英春 ",
                "朱鸣涛 ", "周航宇 ", "杨钰涵 ", "李灿灿 ", "张潇月 ", "唐仲 ", "陈鹏锦 ", "蔡鹏 ", "赵豪 ", "李星海 ", "杨自强 ", "陈佳俊 ", "罗安熊 ",
                "张安琪 ", "胡鑫 ", "张辉 ", "刘木 ", "胡鑫 ", "张辉 ", "刘杰 ", "李凱杰 ", "曾祥瑞 ", "江龙 ", "杨立勇 ", "伍江桥", "任哲稷 ", "李靖 ",
                "黄影 ", "罗杨 ", "邓涛","婷姐","梦竹姐","霸天"};
        String[] gps = {"在厕所门口","在办公室门口"};
        String[] str = {"说我爱杨霸天","说吴冬冬你是我的神","说代恩堃我喜欢你","说朱鸣涛我要跟你结婚","说段云辉我想亲你"};
        int i = random.nextInt(names.length);
        int j = random.nextInt(gps.length);
        int k = random.nextInt(str.length);
        System.out.println("请"+names[i]+gps[j]+str[k]);
    }
}
