package com.dx.Dao;

import com.dx.User.Account;
import com.dx.User.AccountUser;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @Date: 2022/03/28/19:15
 * @Description:一对一和一对多操作
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
    * @Description: 查询所有账户，同时还要获取到当前用户的所属用户信息
    * @Param: []
    * @return: []
    * @Date: 2022/3/28
    */
    List<AccountUser> findAllAccount();

}
