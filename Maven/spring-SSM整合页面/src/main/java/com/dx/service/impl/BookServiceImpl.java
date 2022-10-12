package com.dx.service.impl;

import com.dx.controller.Code;
import com.dx.entity.Book;
import com.dx.exception.BusinessException;
import com.dx.exception.SystemOutException;
import com.dx.mapper.BookMapper;
import com.dx.service.BookService;

import org.omg.CORBA.SystemException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @author 67636
 * @Date: 2022/10/06/14:33
 * @Description:
 */
@Service
public class BookServiceImpl  implements BookService {

    @Autowired
    private BookMapper bookMapper;
    @Override
    public boolean save(Book book) {
        bookMapper.save(book);
        return true;
    }

    @Override
    public boolean update(Book book) {
        bookMapper.update(book);
        return true;
    }

    @Override
    public boolean delete(Integer id) {
        bookMapper.delete(id);
        return true;
    }

    @Override
    public Book getById(Integer id) {
        return bookMapper.getById(id);
    }

    @Override
    public List<Book> getAll() {
        return bookMapper.getAll();
    }
}
