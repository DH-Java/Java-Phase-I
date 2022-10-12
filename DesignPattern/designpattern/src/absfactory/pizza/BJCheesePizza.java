package absfactory.pizza;

/**
 * Created with IntelliJ IDEA.
 *
 * @Date: 2022/05/23/14:46
 * @Description:
 */
public class BJCheesePizza extends Pizza {
    @Override
    public void prepare() {
        setName("北京奶酪披萨");
        System.out.println("北京奶酪披萨 准备原材料");
    }
}
