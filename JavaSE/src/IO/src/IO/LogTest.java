package IO.src.IO;

public class LogTest {
    public static void main(String[] args) {
        Logger.log("调用了System类的gc（）方法，建议启动垃圾回收");
        Logger.log("调用了UserService的doSome方法");
        Logger.log("用户尝试进行登录，验证失败");
    }

}
