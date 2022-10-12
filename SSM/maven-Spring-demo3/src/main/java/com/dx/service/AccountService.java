package com.dx.service;

import com.dx.dao.AccountDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.io.IOException;


/**
 * Created with IntelliJ IDEA.
 *
 * @Date: 2022/03/31/16:29
 * @Description:声明式事务管理事务参数
 */
@Service
//这个注解你可以添加到类或者方法上面
//这个注解如果放在类上面，类里面所有方法都添加事务
//这个注解如果放在方法上面，方法添加事务
@Transactional(propagation= Propagation.REQUIRED,isolation = Isolation.REPEATABLE_READ ,timeout = -1,readOnly = false,rollbackForClassName={"IOException.class"})//事务传播 可重复读 超时时间秒为单位 是否只读
public class AccountService {
    //注入dao
    @Autowired
    private AccountDao accountDao;

    public void account() {
        //第一步 开启事务

        //第二步 进行业务操作
        //转账方法
        accountDao.transferMoney(100, "罗浩");
        //模拟异常
        int i = 10 / 0;
        //到账方法
        accountDao.arrivalMoney(100, "邓豪");

        //第三步 没有发生异常，提交事务

    }
}
