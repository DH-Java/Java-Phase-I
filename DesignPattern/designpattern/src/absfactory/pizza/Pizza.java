package absfactory.pizza;

/**
 * Created with IntelliJ IDEA.
 *  披萨类
 * @Date: 2022/05/23/8:46
 * @Description:
 */
public abstract class Pizza {
    protected String name;

    public abstract void prepare();

    public void bake(){
        System.out.println(name+"bakeing;");
    }
    public void cut(){
        System.out.println(name+"cuting;");
    }
    public void box(){
        System.out.println(name+"boxing;");
    }


    public void setName(String name) {
        this.name = name;
    }
}
