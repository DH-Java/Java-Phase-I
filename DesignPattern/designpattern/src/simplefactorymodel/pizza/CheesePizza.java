package simplefactorymodel.pizza;

/**
 * Created with IntelliJ IDEA.
 *
 * @Date: 2022/05/23/8:50
 * @Description:
 */
public class CheesePizza extends Pizza{
    @Override
    public void prepare() {
        System.out.println("制作奶酪披萨，准备原材料");
    }
}
