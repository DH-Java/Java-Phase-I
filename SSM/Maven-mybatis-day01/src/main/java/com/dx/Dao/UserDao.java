package com.dx.Dao;

import com.dx.User.QueryVo;
import com.dx.User.UserMybatis;
import java.util.List;
/**
* @Description: 增删改查操作
* @Param: 
* @return: 
* @Date: 2022/4/4
*/
public interface UserDao {
    /**
     * 查询所以操作
     *
     * @return
     */
    //@Select("select * from user")
    List<UserMybatis> findAll();

    /**
     * 添加用户信息
     */
    void insertUser(UserMybatis userMybatis);

    /**
     * 修改用户信息
     *
     * @param userMybatis
     */
    void updateUser(UserMybatis userMybatis);

    /**
     * 删除用户信息
     *
     * @param id
     */
    void deleteUser(Integer id);

    /**
     * 根据id查找用户信息
     *
     * @param id
     * @return
     */
    UserMybatis findById(Integer id);

    /**
     * 根据名称模糊查询
     *
     * @param name
     * @return
     */
    List<UserMybatis> findByName(String name);

    /**
     * 查询记录总数量
     *
     * @return
     */
    Integer findCount();

    /**
     * 根据QueryVo中的条件查询用户
     *
     * @return
     */
    List<UserMybatis> findByVo(QueryVo vo);

    /**
     * 根据条件查询
     *
     * @param userMybatis 可能是用户名，也可能是id，性别，地址
     * @return
     */
    List<UserMybatis> findByCondition(UserMybatis userMybatis);

    /**
     * 根据QueryVo中的id集合查询用户列表
     *
     * @param vo
     * @return
     */
    List<UserMybatis> findByIds(QueryVo vo);

}
