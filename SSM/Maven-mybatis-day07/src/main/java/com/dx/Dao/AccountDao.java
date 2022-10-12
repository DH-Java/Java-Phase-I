package com.dx.Dao;

import com.dx.Admin.Account;
import org.apache.ibatis.annotations.One;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.mapping.FetchType;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @Date: 2022/04/06/9:08
 * @Description:一对一多表查询
 */
public interface AccountDao {
    /**
    * @Description: 查询所有账户和其对应的用户信息
    * @Param: []
    * @return: []
    * @Date: 2022/4/6
    */
    @Select(value = "select * from account")
    @Results( id = "account",value = {
            @Result(id = true,column = "id",property = "id"),
            @Result(column = "uid",property = "uid"),
            @Result(column = "money",property = "money"),
            @Result(property ="user", column = "uid",one=@One(select = "com.dx.Dao.UserDao.findById",fetchType= FetchType.EAGER))
    })
    List<Account> findAll();
    /**
    * @Description: 根据id获取对应的账户信息
    * @Param: [id]
    * @return: [java.lang.Integer]
    * @Date: 2022/4/6
    */
    @Select(value = "select * from account where uid =#{id}")
    List<Account> findByUid(Integer id);
}
