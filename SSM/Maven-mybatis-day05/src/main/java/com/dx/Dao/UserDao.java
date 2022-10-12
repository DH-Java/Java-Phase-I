package com.dx.Dao;

import com.dx.User.UserMybatis;

import java.util.List;
/**
* @Description: 一级缓存和二级缓存
* @Param: 
* @return: 
* @Date: 2022/4/4
*/
public interface UserDao {
    /**
     * 查询所有操作，同时还要获取到当前用户的所属用户信息
     *
     * @return
     */
    List<UserMybatis> findAll();

    /**
     * 根据id查找用户信息
     *
     * @param id
     * @return
     */
    UserMybatis findById(Integer id);
    /**
    * @Description: 修改用户操作
    * @Param: [userMybatis]
    * @return: [com.dx.User.UserMybatis]
    * @Date: 2022/4/4
    */
    void updateUser(UserMybatis userMybatis);
}