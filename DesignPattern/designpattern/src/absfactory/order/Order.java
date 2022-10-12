package absfactory.order;

import absfactory.pizza.Pizza;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 *
 * @Date: 2022/05/23/18:45
 * @Description:
 */
public class Order {
    AbsFactory absFactory;
    Pizza pizza;

    public Order(AbsFactory absFactory) {
        setAbsFactory(absFactory);
    }
    private void setAbsFactory(AbsFactory absFactory){
        this.absFactory = absFactory;
        while (true){
            String type = getType();
            pizza = absFactory.createPizza(type);
            if (pizza!=null){
                pizza.prepare();
                pizza.bake();
                pizza.cut();
                pizza.box();
            }else {
                System.out.println("还没有该口味");
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
