package com.dx.dao;

import com.dx.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @Date: 2022/03/30/19:12
 * @Description:
 */
@Repository
//单例还是多例
@Scope
public class BookDaoImpl implements BookDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    /**
     * @Description: 添加操作
     * @Param: [book]
     * @return: [com.dx.entity.Book]
     * @Date: 2022/3/30
     */
    @Override
    public void add(Book book) {
        String sql = "insert into s_book(user_id,username,ustatus) value(?,?,?)";
        Object[] args = {book.getUser_id(), book.getUsername(), book.getUstatus()};
        jdbcTemplate.update(sql, args);
    }

    /**
     * @Description: 修改操作
     * @Param: [book]
     * @return: [com.dx.entity.Book]
     * @Date: 2022/3/30
     */
    @Override
    public void update(Book book) {
        String sql = "update s_book set username=?,ustatus=? where user_id = ?";
        Object[] args = {book.getUsername(), book.getUstatus(), book.getUser_id()};
        jdbcTemplate.update(sql, args);
    }

    /**
     * @Description: 删除操作
     * @Param: [id]
     * @return: [java.lang.Integer]
     * @Date: 2022/3/30
     */
    @Override
    public void delete(Integer id) {
        String sql = "delete from s_book where user_id = ?";
        jdbcTemplate.update(sql, id);
    }

    /**
     * @Description: 查询表中总记录数
     * @Param: []
     * @return: []
     * @Date: 2022/3/30
     */
    @Override
    public int Count() {
        String sql = "select count(*) from s_book";
        return jdbcTemplate.queryForObject(sql, Integer.class);
    }

    /**
     * @Description: 查询返回对象
     * @Param: []
     * @return: []
     * @Date: 2022/3/30
     */
    @Override
    public Book findOne(Integer id) {
        String sql = "select * from s_book where user_id = ?";
        return jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<Book>(Book.class), id);
    }

    /**
     * @Description: 查询返回集合
     * @Param: []
     * @return: []
     * @Date: 2022/3/30
     */
    @Override
    public List<Book> findAll() {
        String sql = "select * from s_book";
        return jdbcTemplate.query(sql, new BeanPropertyRowMapper<Book>(Book.class));
    }

    /**
     * @Description: 批量添加操作
     * @Param: [objects]
     * @return: [java.util.List<java.lang.Object [ ]>]
     * @Date: 2022/3/30
     */
    @Override
    public void insertBatch(List<Object[]> objects) {
        String sql = "insert into s_book(user_id,username,ustatus) value(?,?,?)";
        jdbcTemplate.batchUpdate(sql, objects);
    }

    /**
     * @Description: 批量修改操作
     * @Param: [objects]
     * @return: [java.util.List<java.lang.Object [ ]>]
     * @Date: 2022/3/30
     */
    @Override
    public void updateBatch(List<Object[]> objects) {
        String sql = "update s_book set username=?,ustatus=? where user_id = ?";
        jdbcTemplate.batchUpdate(sql, objects);
    }

    /**
     * @Description: 批量删除操作
     * @Param: [objects]
     * @return: [java.util.List<java.lang.Object [ ]>]
     * @Date: 2022/3/30
     */
    @Override
    public void deleteBatch(List<Object[]> objects) {
        String sql = "delete from s_book where user_id = ?";
        jdbcTemplate.batchUpdate(sql, objects);
    }
}
