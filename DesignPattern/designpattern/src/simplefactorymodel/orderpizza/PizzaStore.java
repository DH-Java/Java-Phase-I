package simplefactorymodel.orderpizza;

import simplefactorymodel.simplefactory.SimpleFactory;

/**
 * Created with IntelliJ IDEA.
 *
 * @Date: 2022/05/23/9:04
 * @Description:
 */
public class PizzaStore {
    public static void main(String[] args) {
        new OrderPizza(new SimpleFactory());
        System.out.println("退出程序");
    }
}
