package com.dx.entity;

import com.baomidou.mybatisplus.annotation.*;
import lombok.Data;

/**
 * Created with IntelliJ IDEA.
 *
 * @author
 * @Date: 2022/10/09/14:22
 * @Description:
 */

/**
 * @author 67636
 * @Description: 如果实体类类名和数据库名不一致可以加@TableName这个注解
 * @Param:
 * @return:
 * @Date: 2022/10/10
 */
@Data
//@TableName(value = "tbl_book")
public class Book {
    /**
    * @Description: 这个注解控制id的属性
    * @Param: 
    * @return: 
    * @Date: 2022/10/10
    */
//    @TableId(type = IdType.ASSIGN_ID)tbl_book
    private Long id;
    /**
     * @Description: 如果实体类中的变量名与数据库字段名不一样，可以使用这个注解属性value来进行绑定，而select让这个字段不参与查询
     * @Param:
     * @return:
     * @Date: 2022/10/10
     */
    @TableField(value = "type", select = false)
    private String type;
    private String name;
    private String description;
    /**
     * @Description: 如果实体类中的变量比数据库中的字段多，可以加此注解
     * @Param:
     * @return:
     * @Date: 2022/10/10
     */
    @TableField(exist = false)
    private double price;

//    @TableLogic(value = "0",delval = "1")
    private Integer deleted;

    @Version
    private Integer version;
}
