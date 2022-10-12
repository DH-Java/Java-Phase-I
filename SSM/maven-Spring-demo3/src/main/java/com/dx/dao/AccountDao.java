package com.dx.dao;

/**
 * Created with IntelliJ IDEA.
 *
 * @Date: 2022/03/31/16:30
 * @Description:事务操作
 */
public interface AccountDao {
    //转账方法
    void transferMoney(Integer money,String name);

    //到账方法
    void arrivalMoney(Integer money,String name);
}
