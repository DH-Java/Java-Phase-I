package com.dx.Dao;

import com.dx.Admin.User;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.mapping.FetchType;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @Date: 2022/04/04/9:55
 * @Description:注解开发单表查询和实体类与数据库字段名不一致
 * @Select @Update @Delete @Insert
 */
//开启二级缓存
@CacheNamespace(blocking = true)
public interface UserDao {

    /**
     * @Description: 查询所有操作
     * @Param: []
     * @return: []
     * @Date: 2022/4/4
     */
    @Select(value = "select * from user")

    @Results(id = "userMap", value = {
            @Result(id = true, column = "id", property = "userid"),
            @Result(column = "sex", property = "usersex"),
            @Result(column = "address", property = "useraddress"),
            @Result(column = "username", property = "username"),
            @Result(column = "birthday", property = "userbirthday"),
            @Result(property = "accounts",column = "id" ,many=@Many(select = "com.dx.Dao.AccountDao.findByUid",fetchType = FetchType.LAZY))
    })
    List<User> findAll();

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
    @ResultMap(value = {"userMap"})
    List<User> findByName(String name);

}
