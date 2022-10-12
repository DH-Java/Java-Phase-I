package com.dx.entity;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.NotNull;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 *
 * @author 67636
 * @author 67636
 * @author 67636
 * @Date: 2022/10/06/16:50
 * @Description:@ConfigurationProperties ： 常用于bean属性和yml配置文件的绑定
 * prefix ： 可以指定配置文件中某一个节点，该节点中的子节点将自动和属性进行绑定
 * @Validated :支持jsr303校验
 */
@ConfigurationProperties(prefix = "user")
@Component
/**
 * @Description: Jsr303校验
 * @Param:
 * @return:
 * @Date: 2022/10/6
 */
@Validated
/**
 * @Description: 引入外部的资源文件，只能使用properties
 * @Param:
 * @return:
 * @Date: 2022/10/6
 */
@PropertySource("classpath:data/user.properties")
public class User {
    private String username;
    private Integer age;
    private Date birthday;
    private List<String> hobbies;
    private Map<Integer, String> girlFriend;
    @NotNull(message = "不能为空")
    private Address address;

    public User() {
    }

    public User(String username, Integer age, Date birthday, List<String> hobbies, Map<Integer, String> girlFriend, Address address) {
        this.username = username;
        this.age = age;
        this.birthday = birthday;
        this.hobbies = hobbies;
        this.girlFriend = girlFriend;
        this.address = address;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public List<String> getHobbies() {
        return hobbies;
    }

    public void setHobbies(List<String> hobbies) {
        this.hobbies = hobbies;
    }

    public Map<Integer, String> getGirlFriend() {
        return girlFriend;
    }

    public void setGirlFriend(Map<Integer, String> girlFriend) {
        this.girlFriend = girlFriend;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", age=" + age +
                ", birthday=" + birthday +
                ", hobbies=" + hobbies +
                ", girlFriend=" + girlFriend +
                ", address=" + address +
                '}';
    }
}
