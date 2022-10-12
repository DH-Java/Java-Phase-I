package reflect.User;

public class UserService {
    /*
    *@Author:DH
    *@Date:2021/12/6 21:00
    *@Description:TODO
    ** @param null
    *@return:
    */
    public boolean login(String name , String password){
        if ("admin".equals(name)&&"123".equals(password)){
            return true;
        }else {
            return false;
        }
    }
    public void logout(){
        System.out.println("你已经安全退出");
    }
}
