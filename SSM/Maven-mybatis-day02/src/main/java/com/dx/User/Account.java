package com.dx.User;

import java.io.Serializable;

/**
 * Created with IntelliJ IDEA.
 *
 * @Date: 2022/03/28/19:13
 * @Description:
 */
public class Account implements Serializable {
    private Integer ID;
    private Integer UID;
    private Double MONEY;
    //从表实体应该包含一个主表实体的对象引用
    private UserMybatis userMybatis;

    public UserMybatis getUserMybatis() {
        return userMybatis;
    }

    public void setUserMybatis(UserMybatis userMybatis) {
        this.userMybatis = userMybatis;
    }

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public Integer getUID() {
        return UID;
    }

    public void setUID(Integer UID) {
        this.UID = UID;
    }

    public Double getMONEY() {
        return MONEY;
    }

    public void setMONEY(Double MONEY) {
        this.MONEY = MONEY;
    }

    @Override
    public String toString() {
        return "Account{" +
                "ID=" + ID +
                ", UID=" + UID +
                ", MONEY=" + MONEY +
                '}';
    }
}
