package simplefactorymodel.simplefactory;

import simplefactorymodel.pizza.CheesePizza;
import simplefactorymodel.pizza.GreekPizza;
import simplefactorymodel.pizza.Pizza;

/**
 * Created with IntelliJ IDEA.
 *
 * @Date: 2022/05/23/9:45
 * @Description:
 */
public class SimpleFactory {

    public Pizza createPizza(String type) {
        System.out.println("简单工厂模式");
        Pizza pizza = null;
        if (type.equals("奶酪")) {
            pizza = new CheesePizza();
            pizza.setName("奶酪披萨");
        } else if (type.equals("希腊")) {
            pizza = new GreekPizza();
            pizza.setName("希腊披萨");
        }
        return pizza;
    }
}
