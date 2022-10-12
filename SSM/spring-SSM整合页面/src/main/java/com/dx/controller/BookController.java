package com.dx.controller;

import com.dx.entity.Book;
import com.dx.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @author 67636
 * @Date: 2022/10/06/14:50
 * @Description:
 */
@RestController
@RequestMapping("/books")
public class BookController {

    @Autowired
    private BookService bookService;

    @PostMapping
    public R save(@RequestBody Book book) {
        boolean flag = bookService.save(book);
        return new R(flag ? Code.SAVE_OK : Code.SAVE_ERROR, flag);
    }

    @PutMapping
    public R update(@RequestBody Book book) {
        boolean flag = bookService.update(book);
        return new R(flag ? Code.UPDATE_OK : Code.UPDATE_ERROR, flag);
    }

    @DeleteMapping("/{id}")
    public R delete(@PathVariable Integer id) {
        boolean flag = bookService.delete(id);
        return new R(flag ? Code.DELETE_OK : Code.DELETE_ERROR, flag);
    }

    @GetMapping("/{id}")
    public R getById(@PathVariable Integer id) {
//        int i = 1/0;
        Book book = bookService.getById(id);
        Integer code = book != null ? Code.GET_OK : Code.GET_ERROR;
        String msg = book != null ? "" : "数据查询失败，请重试";
        return new R(code, book, msg);
    }

    @GetMapping
    public R getAll() {
        List<Book> bookList = bookService.getAll();
        Integer code = bookList != null ? Code.GET_OK : Code.GET_ERROR;
        String msg = bookList != null ? "" : "数据查询失败，请重试";
        return new R(code, bookList, msg);
    }
}
