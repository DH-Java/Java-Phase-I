package com.dx.Dao;
/**
* @Description: AOP的注解方式和xml方式
* @Param:
* @return:
* @Date: 2022/4/6
*/
public interface UserDao {
    //求和
    public int add(int a , int b);
    //修改id
    public String update(String id);
}
