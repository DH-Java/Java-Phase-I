package seven.dependencyinversion;

/**
 * Created with IntelliJ IDEA.
 *
 * @Date: 2022/05/16/18:45
 * @Description:
 */
public class DependencyInversion {
    public static void main(String[] args) {
        Person person = new Person();
        person.receive(new Email());

    }
}


class Email{
    public String getInfo(){
        return "email:Hello World";
    }
}
/**
* @Description: 完成Person接受信息的功能
 * 方式一分析：
 *  1、简单，比较容易想到
 *  2、如果我们获取的对象是微信，短信等等，则新增类，同时Person也要增加相应的接受方法
 *  3、解决思路：引入一个抽象的接口IReceiver，表示接收者，这样的person类与接口IReceiver发生依赖
 *      因为Email，微信等等属于接受的范围，他们各自实现IReceiver,接口就ok这样我们就符合依赖倒置原则
* @Param:
* @return:
* @Date: 2022/5/16
*/
class Person{
    public void receive(Email email){
        System.out.println(email.getInfo());
    }
}
