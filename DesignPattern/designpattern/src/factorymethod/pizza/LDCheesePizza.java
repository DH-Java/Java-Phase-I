package factorymethod.pizza;

/**
 * Created with IntelliJ IDEA.
 *
 * @Date: 2022/05/23/14:49
 * @Description:
 */
public class LDCheesePizza extends Pizza{
    @Override
    public void prepare() {
        setName("伦敦奶酪披萨");
        System.out.println("伦敦奶酪披萨 准备原材料");
    }
}
