package absfactory.order;

import absfactory.pizza.LDCheesePizza;
import absfactory.pizza.LDGreekPizza;
import absfactory.pizza.Pizza;
import factorymethod.order.Order;

/**
 * Created with IntelliJ IDEA.
 *
 * @Date: 2022/05/23/14:58
 * @Description:
 */
public class LDOrder implements AbsFactory {

    Pizza pizza;

    @Override
    public Pizza createPizza(String type) {
        if (type.equals("奶酪")) {
            pizza = new LDCheesePizza();
        } else if (type.equals("希腊")) {
            pizza = new LDGreekPizza();
        }
        return pizza;
    }
}
