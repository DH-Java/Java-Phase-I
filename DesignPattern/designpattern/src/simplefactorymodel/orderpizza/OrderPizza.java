package simplefactorymodel.orderpizza;

import simplefactorymodel.pizza.CheesePizza;
import simplefactorymodel.pizza.GreekPizza;
import simplefactorymodel.pizza.Pizza;
import simplefactorymodel.simplefactory.SimpleFactory;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 *
 * @Date: 2022/05/23/8:54
 * @Description:
 */
public class OrderPizza {

    private Pizza pizza;

    SimpleFactory simpleFactory;

    public OrderPizza(SimpleFactory simpleFactory) {
     /*   String type;
        do {
            type = getType();
            if (type.equals("奶酪")){
                pizza = new CheesePizza();
                pizza.setName("奶酪披萨");
            }else if (type.equals("希腊")){
                pizza = new GreekPizza();
                pizza.setName("希腊披萨");
            }else{
                break;
            }
            pizza.prepare();
            pizza.bake();
            pizza.cut();
            pizza.box();
        }while (true);*/
        setSimpleFactory(simpleFactory);
    }


    public void setSimpleFactory(SimpleFactory simpleFactory) {

        String type = "";

        this.simpleFactory = simpleFactory;

        do {
            type = getType();
            pizza = this.simpleFactory.createPizza(type);
            if (pizza != null) {
                pizza.prepare();
                pizza.bake();
                pizza.cut();
                pizza.box();
            } else {
                System.out.println("未找到该种类");
                break;
            }

        } while (true);
    }

    public String getType() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入订购的种类");
        String order = scanner.next();
        return order;
    }
}
