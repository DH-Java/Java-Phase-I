package com.dx.entity;

/**
 * Created with IntelliJ IDEA.
 *
 * @author 67636
 * @Date: 2022/10/06/16:50
 * @Description:
 */
public class Address {

    private Integer id;
    private String desc;

    public Address() {
    }

    public Address(Integer id, String desc) {
        this.id = id;
        this.desc = desc;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    @Override
    public String toString() {
        return "Address{" +
                "id=" + id +
                ", desc='" + desc + '\'' +
                '}';
    }
}
