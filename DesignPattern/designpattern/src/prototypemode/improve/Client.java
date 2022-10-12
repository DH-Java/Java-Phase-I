package prototypemode.improve;


/**
 * Created with IntelliJ IDEA.
 * 浅拷贝
 *
 * @Date: 2022/05/23/19:45
 * @Description:
 */
public class Client {
    public static void main(String[] args) {
        Sheep sheep = new Sheep("tom", 1, "白色");
        Integer num = 10;
        for (int i = 0; i < num; i++) {
            try {
                Sheep sheep1 = (Sheep) sheep.clone();
            } catch (CloneNotSupportedException e) {
                e.printStackTrace();
            }
            System.out.println(sheep);
        }
    }
}
