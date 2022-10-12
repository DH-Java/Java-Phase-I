package com.dx.Dao;

public class UserDaoImpl implements UserDao{
    /**
     * 求和
     * @param a
     * @param b
     * @return
     */
    @Override
    public int add(int a, int b) {
        System.out.println("add执行了....");
        return a+b;
    }

    /**
     * 修改id
     * @param id
     * @return
     */
    @Override
    public String update(String id) {
        System.out.println("update执行了....");
        return id;
    }
}
