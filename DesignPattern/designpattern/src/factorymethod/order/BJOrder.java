package factorymethod.order;

import factorymethod.pizza.BJCheesePizza;
import factorymethod.pizza.BJGreekPizza;
import factorymethod.pizza.Pizza;

/**
 * Created with IntelliJ IDEA.
 *
 * @Date: 2022/05/23/14:56
 * @Description:
 */
public class BJOrder extends Order {
    @Override
    Pizza createPizza(String type) {
        if (type.equals("奶酪")) {
            pizza = new BJCheesePizza();
        } else if (type.equals("希腊")) {
            pizza = new BJGreekPizza();
        }
        return pizza;
    }
}
