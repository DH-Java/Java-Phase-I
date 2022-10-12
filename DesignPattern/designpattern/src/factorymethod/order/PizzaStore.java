package factorymethod.order;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 *
 * @Date: 2022/05/23/14:59
 * @Description:
 */
public class PizzaStore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入想吃的口味地区");
        String s = scanner.next();
        if (s.equals("北京")){
            new BJOrder();
        }else if (s.equals("伦敦")){
            new LDOrder();
        }else {
            System.out.println("该地区还未有");
        }
    }
}
