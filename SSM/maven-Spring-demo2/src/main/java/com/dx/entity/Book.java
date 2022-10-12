package com.dx.entity;

/**
 * Created with IntelliJ IDEA.
 *
 * @Date: 2022/03/30/19:33
 * @Description:
 */
public class Book {
    private Integer user_id;
    private String username;
    private String ustatus;

    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUstatus() {
        return ustatus;
    }

    public void setUstatus(String ustatus) {
        this.ustatus = ustatus;
    }

    @Override
    public String toString() {
        return "Book{" +
                "user_id=" + user_id +
                ", username='" + username + '\'' +
                ", ustatus='" + ustatus + '\'' +
                '}';
    }
}
