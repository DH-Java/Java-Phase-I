package com.dx.controller;

import com.dx.entity.Book;
import org.springframework.web.bind.annotation.*;

/**
 * Created with IntelliJ IDEA.
 *
 * @author 67636
 * @Date: 2022/10/05/21:47
 * @Description:
 */
@RestController
@RequestMapping("/books")
public class BookController {

    @PostMapping
    public String save(@RequestBody Book book) {
        System.out.println("books save"+book);
        return "{module :  books save.....}";
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable Integer id) {
        System.out.println("books delete ==> " + id);
        return "{module : books delete}";
    }


    @PutMapping
    public String update(@RequestBody Book book) {
        System.out.println("Books update... ==> " + book);
        return "{module : user update}";
    }

    @GetMapping("/{id}")
    public String getById(@PathVariable Integer id) {
        System.out.println("Books getById  ：" + id);
        return "{'module':'book geyById'}";
    }

    @GetMapping
    public String getAll() {
        System.out.println("book getAll");
        return "{'module':'book getAll'}";
    }
}
