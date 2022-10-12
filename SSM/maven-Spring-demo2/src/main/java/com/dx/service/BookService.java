package com.dx.service;

import com.dx.dao.BookDao;
import com.dx.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.sql.DataSource;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @Date: 2022/03/30/19:11
 * @Description:
 */
@Service
public class BookService {
    @Autowired
    private BookDao bookDao;

    /**
     * @Description: 数据库添加操作
     * @Param: [book]
     * @return: [com.dx.entity.Book]
     * @Date: 2022/3/30
     */
    public void insertBook(Book book) {
        bookDao.add(book);
    }

    /**
     * @Description: 数据库修改操作
     * @Param: [book]
     * @return: [com.dx.entity.Book]
     * @Date: 2022/3/30
     */
    public void updateBook(Book book) {
        bookDao.update(book);
    }

    /**
     * @Description: 删除数据库操作
     * @Param: [id]
     * @return: [java.lang.Integer]
     * @Date: 2022/3/30
     */
    public void deleteBook(Integer id) {
        bookDao.delete(id);
    }

    /**
     * @Description: 查询表中总记录数
     * @Param: []
     * @return: []
     * @Date: 2022/3/30
     */
    public int selectCountBook() {
        return bookDao.Count();
    }

    /**
     * @Description: 查询返回对象
     * @Param: []
     * @return: []
     * @Date: 2022/3/30
     */
    public Book selectFindOne(Integer id) {
        return bookDao.findOne(id);
    }

    /**
     * @Description: 查询返回集合
     * @Param: []
     * @return: []
     * @Date: 2022/3/30
     */
    public List<Book> selectFindAll() {
        return bookDao.findAll();
    }

    /**
     * @Description: 批量添加操作
     * @Param: [objects]
     * @return: [java.util.List<java.lang.Object [ ]>]
     * @Date: 2022/3/30
     */
    public void insertAll(List<Object[]> objects) {
        bookDao.insertBatch(objects);
    }

    /**
     * @Description: 批量修改操作
     * @Param: [objects]
     * @return: [java.util.List<java.lang.Object>]
     * @Date: 2022/3/30
     */
    public void updateAll(List<Object[]> objects) {
        bookDao.updateBatch(objects);
    }

    /**
     * @Description: 批量删除操作
     * @Param: [objects]
     * @return: [java.util.List<java.lang.Object>]
     * @Date: 2022/3/30
     */
    public void deleteAll(List<Object[]> objects) {
        bookDao.deleteBatch(objects);
    }

}
