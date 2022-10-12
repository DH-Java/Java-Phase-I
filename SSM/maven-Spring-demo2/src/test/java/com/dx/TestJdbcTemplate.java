package com.dx;

import com.dx.entity.Book;
import com.dx.service.BookService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @Date: 2022/03/30/19:42
 * @Description:
 */
public class TestJdbcTemplate {
    //添加数据库操作
    @Test
    public void TestInsertBook() {
        ApplicationContext context = new ClassPathXmlApplicationContext("MySQLConfig.xml");
        BookService bookService = context.getBean("bookService", BookService.class);
        Book book = new Book();
        book.setUser_id(5);
        book.setUsername("邓世昌");
        book.setUstatus("海军");
        bookService.insertBook(book);
    }

    //修改数据库操作
    @Test
    public void TestUpdateBook() {
        ApplicationContext context = new ClassPathXmlApplicationContext("MySQLConfig.xml");
        BookService bookService = context.getBean("bookService", BookService.class);
        Book book = new Book();
        book.setUser_id(5);
        book.setUsername("邓世昌");
        book.setUstatus("将军");
        bookService.updateBook(book);
    }

    //删除数据库操作
    @Test
    public void TestDeleteBook() {
        ApplicationContext context = new ClassPathXmlApplicationContext("MySQLConfig.xml");
        BookService bookService = context.getBean("bookService", BookService.class);
        bookService.deleteBook(5);
    }

    //查询表中总记录数
    @Test
    public void TestSelectCountBook() {
        ApplicationContext context = new ClassPathXmlApplicationContext("MySQLConfig.xml");
        BookService bookService = context.getBean("bookService", BookService.class);
        int countBook = bookService.selectCountBook();
        System.out.println(countBook);
    }

    //查询返回对象
    @Test
    public void TestSelectFindOneBook() {
        ApplicationContext context = new ClassPathXmlApplicationContext("MySQLConfig.xml");
        BookService bookService = context.getBean("bookService", BookService.class);
        Book id = bookService.selectFindOne(1);
        System.out.println(id);
    }

    //查询返回集合
    @Test
    public void TestSelectFindAllBook() {
        ApplicationContext context = new ClassPathXmlApplicationContext("MySQLConfig.xml");
        BookService bookService = context.getBean("bookService", BookService.class);
        List<Book> books = bookService.selectFindAll();
        System.out.println(books);
    }

    //批量添加操作
    @Test
    public void TestInsertBatchBook() {
        ApplicationContext context = new ClassPathXmlApplicationContext("MySQLConfig.xml");
        BookService bookService = context.getBean("bookService", BookService.class);
        ArrayList<Object[]> list = new ArrayList<>();
        Object[] o1 = {5, "Spring", "尚硅谷"};
        Object[] o2 = {6, "Mybatis", "黑马程序员"};
        Object[] o3 = {7, "SpringMVC", "未知"};
        list.add(o1);
        list.add(o2);
        list.add(o3);
        bookService.insertAll(list);
    }

    //批量修改操作
    @Test
    public void TestUpdateBatchBook() {
        ApplicationContext context = new ClassPathXmlApplicationContext("MySQLConfig.xml");
        BookService bookService = context.getBean("bookService", BookService.class);
        ArrayList<Object[]> list = new ArrayList<>();
        Object[] o1 = {"Spring", "未完成", 5};
        Object[] o2 = {"Mybatis", "未完成", 6};
        Object[] o3 = {"SpringMVC", "未完成", 7};
        list.add(o1);
        list.add(o2);
        list.add(o3);
        bookService.updateAll(list);
    }

    //批量删除操作
    @Test
    public void TestDeleteBatchBook() {
        ApplicationContext context = new ClassPathXmlApplicationContext("MySQLConfig.xml");
        BookService bookService = context.getBean("bookService", BookService.class);
        ArrayList<Object[]> list = new ArrayList<>();
        Object[] o1 = {5};
        Object[] o2 = {6};
        Object[] o3 = {7};
        list.add(o1);
        list.add(o2);
        list.add(o3);
        bookService.deleteAll(list);
    }
}
