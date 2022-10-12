package com.dx.entity.query;

import com.dx.entity.Book;
import lombok.Data;

/**
 * Created with IntelliJ IDEA.
 *
 * @author 67636
 * @Date: 2022/10/10/11:51
 * @Description:
 */
@Data
public class BookQuery extends Book {
    private Long idEnd;
}
