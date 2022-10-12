package com.dx.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 * Created with IntelliJ IDEA.
 *
 * @Date: 2022/03/31/16:30
 * @Description:
 */
@Repository
public class AccountImpl implements AccountDao {
    //注入jdbcTemplate
    @Autowired
    private JdbcTemplate jdbcTemplate;

    /**
     * @Description: 转账方法
     * @Param: []
     * @return: []
     * @Date: 2022/3/31
     */
    @Override
    public void transferMoney(Integer money, String name) {
        String sql = "update s_account set money = money-? where name = ?";
        jdbcTemplate.update(sql, money, name);
    }

    /**
     * @Description: 到账方法
     * @Param: []
     * @return: []
     * @Date: 2022/3/31
     */
    @Override
    public void arrivalMoney(Integer money, String name) {
        String sql = "update s_account set money = money+? where name = ?";
        jdbcTemplate.update(sql, money, name);
    }


}
