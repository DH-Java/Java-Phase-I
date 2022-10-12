package seven.dependencyinversion;

/**
 * Created with IntelliJ IDEA.
 *
 * @Date: 2022/05/16/19:03
 * @Description:
 */
public class DependencyInversion1 {
    public static void main(String[] args) {
        Person1 person1 = new Person1();
        person1.receive(new Email1());
        person1.receive(new WeiXin());

    }
}

interface IReceive{
    String getInfo();
}

class Email1 implements IReceive{
    public String getInfo(){
        return "email:Hello World";
    }
}

class WeiXin implements IReceive{

    @Override
    public String getInfo() {
        return "微信信息：Hello World";
    }
}
/**
 * @Description: 完成Person接受信息的功能
 * 方式二
 * @Param:
 * @return:
 * @Date: 2022/5/16
 */
class Person1{
    public void receive(IReceive iReceive){
        System.out.println(iReceive.getInfo());
    }
}
