package com.dx.domain;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 *
 * @Date: 2022/04/13/18:40
 * @Description:
 */
public class User implements Serializable {
    private String username;
    private String password;
    private List<Money> list;
    private Map<String,Money> map;
    //private Money money;

//    public Money getMoney() {
//        return money;
//    }
//
//    public void setMoney(Money money) {
//        this.money = money;
//    }


    public List<Money> getList() {
        return list;
    }

    public void setList(List<Money> list) {
        this.list = list;
    }

    public Map<String, Money> getMap() {
        return map;
    }

    public void setMap(Map<String, Money> map) {
        this.map = map;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", list=" + list +
                ", map=" + map +
                '}';
    }
}
