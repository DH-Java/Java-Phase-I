package factorymethod.pizza;

/**
 * Created with IntelliJ IDEA.
 *
 * @Date: 2022/05/23/14:48
 * @Description:
 */
public class BJGreekPizza extends Pizza{
    @Override
    public void prepare() {
        setName("北京希腊披萨");
        System.out.println("北京希腊披萨 准备原材料");
    }
}
