package factorymethod.order;

import factorymethod.pizza.Pizza;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 *
 * @Date: 2022/05/23/14:51
 * @Description:
 */
public abstract class Order {

    abstract Pizza createPizza(String type);
    Pizza pizza;

    boolean flag = true;

    public Order() {
        while (flag) {
            String type = getType();
            createPizza(type);
            if (pizza != null) {
                pizza.prepare();
                pizza.bake();
                pizza.cut();
                pizza.box();
            } else {
                System.out.println("还没有这样的口味");
                break;
            }
        }
    }

    public String getType() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入订购的种类");
        String order = scanner.next();
        return order;
    }
}
