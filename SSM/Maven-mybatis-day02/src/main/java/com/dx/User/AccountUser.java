package com.dx.User;

/**
 * Created with IntelliJ IDEA.
 *
 * @Date: 2022/03/28/19:36
 * @Description:
 */
public class AccountUser extends Account{
    private String username;
    private String address;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        //加上父类的toString
        return super.toString()+"AccountUser{" +
                "username='" + username + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
