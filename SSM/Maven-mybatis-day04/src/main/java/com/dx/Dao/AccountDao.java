package com.dx.Dao;

import com.dx.User.Account;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @Date: 2022/03/28/19:15
 * @Description:及时加载和延时加载
 */
public interface AccountDao {
    /**
    * @Description: 查询所有账户，同时还要获取到当前用户的所属用户信息
    * @Param: []
    * @return: []
    * @Date: 2022/3/28
    */
    List<Account> findAll();

    /**
    * @Description: 根据id查询账户信息
    * @Param: [id]
    * @return: [java.lang.Integer]
    * @Date: 2022/4/2
    */
    List<Account> findByAId(Integer id);
}
