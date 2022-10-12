package com.dx;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.dx.entity.Book;
import com.dx.entity.query.BookQuery;
import com.dx.mapper.BookMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

@SpringBootTest
class MybatisPlusApplicationTests {
    @Autowired
    private BookMapper bookMapper;


    @Test
    void testSave() {
        Book book = new Book();
        book.setType("数据库");
        book.setName("Mysql");
        book.setDescription("增删改查");
        bookMapper.insert(book);
    }

    @Test
    void testDelete() {
        bookMapper.deleteById(22);
    }
    @Test
    void testDeleteBatchIds(){
        ArrayList<Long> bookList = new ArrayList<>();
        bookList.add(1579377182449389569L);
        bookList.add(1579378331629948930L);
        bookList.add(1579379186173247489L);
        bookMapper.deleteBatchIds(bookList);
    }
    @Test
    void testSelectBatchIds(){
        ArrayList<Long> bookList = new ArrayList<>();
        bookList.add(1L);
        bookList.add(2L);
        bookList.add(3L);
        bookMapper.selectBatchIds(bookList);
    }


    @Test
    void testUpdate() {
        //乐观锁
        Book book1 = new Book();
        Book book2 = new Book();
        book1.setId(1L);
        book1.setType("context");
        book1.setVersion(2);
        book2.setId(1L);
        book2.setType("servlet");
        book2.setVersion(2);
        bookMapper.updateById(book1);
        bookMapper.updateById(book2);
    }

    @Test
    void testGetById() {
        Book book = bookMapper.selectById(15L);
        System.out.println(book);
    }

    @Test
    void testGetAll() {
        List<Book> books = bookMapper.selectList(null);
        System.out.println(books);
    }

    /**
     * @Description: Mp分页查询
     * @Param: []
     * @return: []
     * @Date: 2022/10/10
     */
    @Test
    void testGetBtPage() {
        IPage page = new Page(1, 3);
        bookMapper.selectPage(page, null);
        System.out.println("显示当前多少页" + page.getCurrent());
        System.out.println("每页显示多少个" + page.getSize());
        System.out.println("一共多少页" + page.getPages());
        System.out.println("一共多少条数据" + page.getTotal());
        System.out.println("数据" + page.getRecords());
    }

    /**
     * @Description: 方式一：按条件查询 方式二：lambda格式按条件查询
     * @Param: []
     * @return: []
     * @Date: 2022/10/10
     */
    @Test
    void testGetAllById() {
//        QueryWrapper queryWrapper = new QueryWrapper();
//        //查询数据库中id小于10的数据
//        queryWrapper.lt("id", "10");
//        List<Book> list = bookMapper.selectList(queryWrapper);
//        System.out.println(list);


//        QueryWrapper<Book> queryWrapper = new QueryWrapper<Book>();
//        //查询数据库中id小于10的数据
//        queryWrapper.lambda().lt(Book::getId, "10");
//        List<Book> list = bookMapper.selectList(queryWrapper);
//        System.out.println(list);

        //按lambda格式查询
//        LambdaQueryWrapper<Book> lqw = new LambdaQueryWrapper<>();
//        //查询数据库中大于5并且小于10;
//        lqw.lt(Book::getId, "10").gt(Book::getId,"5");
//        //查询数据库中id小于5的数据和大于10的数据
//        lqw.lt(Book::getId, "5").or().gt(Book::getId,"10");
//        List<Book> list = bookMapper.selectList(lqw);
//        System.out.println(list);

        //如果有条件为null
//        BookQuery bookQuery = new BookQuery();
//        bookQuery.setId(10L);
//        LambdaQueryWrapper<Book> lqw = new LambdaQueryWrapper<>();
//        lqw.lt(null!=bookQuery.getIdEnd(),Book::getId,bookQuery.getIdEnd())
//           .gt(null!=bookQuery.getId(),Book::getId,bookQuery.getId());
//        List<Book> list = bookMapper.selectList(lqw);
//        System.out.println(list);

//        查询投影
//        LambdaQueryWrapper<Book> lqw = new LambdaQueryWrapper<>();
//        lqw.select(Book::getId,Book::getName);
//        List<Book> list = bookMapper.selectList(lqw);
//        System.out.println(list);

        //查询投影:按名字分组
//        QueryWrapper<Book> qw = new QueryWrapper<Book>();
//        qw.select("count(*) as count,name");
//        qw.groupBy("name");
//        List<Map<String, Object>> list = bookMapper.selectMaps(qw);
//        System.out.println(list);

        //判断数据equals
//        LambdaQueryWrapper<Book> lqw = new LambdaQueryWrapper<>();
//        lqw.eq(Book::getId,"1").eq(Book::getType,"类别测试数据");
//        Book tblBook = bookMapper.selectOne(lqw);
//        System.out.println(tblBook);
//
        BookQuery bookQuery = new BookQuery();
        bookQuery.setId(10L);
        bookQuery.setIdEnd(5L);

        LambdaQueryWrapper<Book> lwq = new LambdaQueryWrapper<>();
//        lwq.le(Book::getId,bookQuery.getId()).ge(Book::getId,bookQuery.getIdEnd());
        lwq.between(Book::getId,bookQuery.getIdEnd(),bookQuery.getId());
        List<Book> bookList = bookMapper.selectList(lwq);
        System.out.println(bookList);

    }

}
