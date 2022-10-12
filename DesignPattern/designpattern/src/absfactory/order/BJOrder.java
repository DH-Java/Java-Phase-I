package absfactory.order;

import absfactory.pizza.BJCheesePizza;
import absfactory.pizza.BJGreekPizza;
import absfactory.pizza.Pizza;

/**
 * Created with IntelliJ IDEA.
 *
 * @Date: 2022/05/23/18:40
 * @Description:
 */
public class BJOrder implements AbsFactory {

    Pizza pizza;

    @Override
    public Pizza createPizza(String type) {
        if (type.equals("奶酪")) {
            pizza = new BJCheesePizza();
        } else if (type.equals("希腊")) {
            pizza = new BJGreekPizza();
        }else {
            return null;
        }
        return pizza;
    }
}
