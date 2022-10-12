package com.dx.dao;

import com.dx.entity.Book;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @Date: 2022/03/30/19:11
 * @Description:JDBCTemplate操作
 */
public interface BookDao {
    /**
     * @Description: 添加方法
     * @Param: [book]
     * @return: [com.dx.entity.Book]
     * @Date: 2022/3/30
     */
    void add(Book book);

    /**
     * @Description: 修改操作
     * @Param: [book]
     * @return: [com.dx.entity.Book]
     * @Date: 2022/3/30
     */
    void update(Book book);

    /**
     * @Description: 删除操作
     * @Param: [id]
     * @return: [java.lang.Integer]
     * @Date: 2022/3/30
     */
    void delete(Integer id);

    /**
     * @Description: 查询表中总记录数
     * @Param: []
     * @return: []
     * @Date: 2022/3/30
     */
    int Count();

    /**
     * @Description: 查询返回对象
     * @Param: []
     * @return: []
     * @Date: 2022/3/30
     */
    Book findOne(Integer id);

    /**
     * @Description: 查询返回集合
     * @Param: []
     * @return: []
     * @Date: 2022/3/30
     */
    List<Book> findAll();

    /**
     * @Description: 批量添加操作
     * @Param: [objects]
     * @return: [java.util.List<java.lang.Object [ ]>]
     * @Date: 2022/3/30
     */
    void insertBatch(List<Object[]> objects);

    /**
     * @Description: 批量修改操作
     * @Param: []
     * @return: []
     * @Date: 2022/3/30
     */
    void updateBatch(List<Object[]> objects);

    /**
     * @Description: 批量删除操作
     * @Param: []
     * @return: []
     * @Date: 2022/3/30
     */
    void deleteBatch(List<Object[]> objects);
}
