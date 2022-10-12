package Exception类;

public class UserService {
    public static void main(String[] args) {
        UserService userService = new UserService();
        try {
            userService.register("dengjie","123");
        } catch (ExceptionTest06 exceptionTest06) {
            exceptionTest06.printStackTrace();
            //返回此throwable的详细消息字符串。
            System.out.println(exceptionTest06.getMessage());
        }
    }

    public void register(String username , String password)throws ExceptionTest06{
        //引用等于null的判断最好放到所有条件的最前面
        if (username == null||username.length()<6 ||username.length()>14){
            //System.out.println("用户名不合法，长度必须在6-14之间");
            throw new ExceptionTest06("用户名不合法，长度必须在6-14之间");

        }
        System.out.println("注册成功，欢迎【"+username+"】");
    }
}
