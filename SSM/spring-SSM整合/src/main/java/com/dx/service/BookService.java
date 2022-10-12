package com.dx.service;

import com.dx.entity.Book;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @author 67636
 * @Date: 2022/10/06/14:33
 * @Description:
 */
@Transactional
public interface BookService {

    /**
     * @Description: 保存
     * @Param: [book]
     * @return: [com.dx.entity.Book]
     * @Date: 2022/10/6
     */
    public boolean save(Book book);

    /**
     * @Description: 修改
     * @Param: [book]
     * @return: [com.dx.entity.Book]
     * @Date: 2022/10/6
     */
    public boolean update(Book book);


    /**
     * @Description: 删除
     * @Param: [id]
     * @return: [java.lang.Integer]
     * @Date: 2022/10/6
     */
    public boolean delete(Integer id);


    /**
     * @Description: 根据id获取
     * @Param: [id]
     * @return: [java.lang.Integer]
     * @Date: 2022/10/6
     */
    public Book getById(Integer id);


    /**
     * @Description: 获取全部
     * @Param: []
     * @return: []
     * @Date: 2022/10/6
     */
    public List<Book> getAll();
}
