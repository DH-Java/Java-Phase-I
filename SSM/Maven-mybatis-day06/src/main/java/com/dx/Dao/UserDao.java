package com.dx.Dao;

import com.dx.Admin.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @Date: 2022/04/04/9:55
 * @Description:注解开发增删改查和实体类与数据库字段名不一致
 * @Select @Update @Delete @Insert
 */
public interface UserDao {

    @Results(id = "userMap",value = {
            @Result(id = true,column ="id" ,property ="userid" ),
            @Result(column = "sex" ,property = "usersex"),
            @Result(column = "address",property = "useraddress"),
            @Result(column = "username",property = "username"),
            @Result(column = "birthday" ,property = "userbirthday")
    })
    /**
    * @Description: 查询所有操作
    * @Param: []
    * @return: []
    * @Date: 2022/4/4
    */
    @Select(value = "select * from user")
    @ResultMap(value = {"userMap"})
    List<User> findAll();
    /**
    * @Description: 添加操作
    * @Param: [user]
    * @return: [com.dx.Admin.User]
    * @Date: 2022/4/4
    */
    @Insert(value = "insert into user(username,sex,address,birthday)values(#{username},#{sex},#{address},#{birthday})")
    @ResultMap(value = "userMap")
    void insertUser(User user);
    /**
    * @Description: 修改操作
    * @Param: []
    * @return: []
    * @Date: 2022/4/4
    */
    @Update(value = "update user set username=#{username},address=#{address} where id=#{id}")
    @ResultMap(value = "userMap")
    void updateUser(User user );
    /**
    * @Description: 删除操作
    * @Param: [id]
    * @return: [java.lang.Integer]
    * @Date: 2022/4/4
    */
    @Delete(value = "delete from user where id = #{id}")
    @ResultMap(value = "userMap")
    void deleteUser(Integer id);
    /**
    * @Description: 根据id查询用户
    * @Param: [id]
    * @return: [java.lang.Integer]
    * @Date: 2022/4/4
    */
    @Select(value = "select * from user where id = #{id}")
    @ResultMap(value = "userMap")
    List<User> findById(Integer id);
    /**
    * @Description: 根据用户名模糊查询用户
    * @Param: [name]
    * @return: [java.lang.String]
    * @Date: 2022/4/4
    */
    //@Select(value = "select * from user where username like #{name}")
    @Select(value = "select * from user where username like '%${value}%'")
    @ResultMap(value = "userMap")
    List<User> findByName(String name);
    /**
    * @Description: 查询总记录数
    * @Param: []
    * @return: []
    * @Date: 2022/4/4
    */
    @Select(value = "select count(*) from user")
    @ResultMap(value = "userMap")
    Integer selectCount();
}
