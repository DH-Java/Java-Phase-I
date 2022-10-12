package factorymethod.pizza;

/**
 * Created with IntelliJ IDEA.
 *
 * @Date: 2022/05/23/14:50
 * @Description:
 */
public class LDGreekPizza extends Pizza {

    @Override
    public void prepare() {
        setName("伦敦希腊披萨");
        System.out.println("伦敦希腊披萨 准备原材料");
    }
}
