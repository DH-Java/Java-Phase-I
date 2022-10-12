package com.dx.Dao;

import com.dx.User.RoleBean;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @Date: 2022/03/29/0:03
 * @Description:duo多对多操作
 */
public interface RoleDao {
    /**
    * @Description: 获取所有角色信息
    * @Param:
    * @return:
    * @Date: 2022/3/29
    */
    List<RoleBean> findAll();
}
