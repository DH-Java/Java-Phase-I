package absfactory.order;

import absfactory.pizza.Pizza;

/**
 * Created with IntelliJ IDEA.
 *
 * @Date: 2022/05/23/18:38
 * @Description:
 */
public interface AbsFactory {

    abstract Pizza createPizza(String type);
}
