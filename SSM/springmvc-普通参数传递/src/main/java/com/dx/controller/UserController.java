package com.dx.controller;

import com.dx.entity.User;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Queue;

/**
 * Created with IntelliJ IDEA.
 *
 * @author 67636
 * @Date: 2022/10/02/21:57
 * @Description:
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @RequestMapping("/save")
    /**
     * @Description: 请求参数名与形参名不同
     * @Param:
     * @return:
     * @Date: 2022/10/2
     */
    public String save(@RequestParam("username") String name, int age) {
        System.out.println("普通参数传递name:" + name);
        System.out.println("普通参数传递age:" + age);
        return "User save.....";
    }

    /**
     * @Description: pojo参数传递
     * @Param: [user]
     * @return: [com.dx.entity.User]
     * @Date: 2022/10/2
     */
    @RequestMapping("/pojoParam")
    public String pojoParam(User user) {
        System.out.println("pojo参数传递 user ==> " + user);
        return "{module : pojo param}";
    }

    /**
     * @Description: pojo参数嵌套pojo参数传值
     * @Param: [user]
     * @return: [com.dx.entity.User]
     * @Date: 2022/10/4
     */
    @RequestMapping("/pojoContainPojoPara")
    public String pojoContainPojoParam(User user) {
        System.out.println("pojo嵌套pojo参数传递 user ==> " + user);
        return "{module : pojo contain pojo param}";
    }

    /**
     * @Description: 数组传递参数
     * @Param: [likes]
     * @return: [java.lang.String[]]
     * @Date: 2022/10/4
     */
    @RequestMapping("/arrayParam")
    public String arrayParam(String[] likes) {
        System.out.println("数组参数传递likes==》" + Arrays.toString(likes));
        return "{'module':'array param'}";
    }

    /**
     * @Description: 集合参数传递
     * @Param: [likes]
     * @return: [java.util.List<java.lang.String>]
     * @Date: 2022/10/4
     */
    @RequestMapping("/listParam")
    public String listParam(@RequestParam List<String> likes) {
        System.out.println("集合参数传递likes==》" + likes);
        return "{'module':'List param'}";
    }

    /**
     * @Description: 集合参数：Json格式
     * @Param: [likes]
     * @return: [java.util.List<java.lang.String>]
     * @Date: 2022/10/4
     */
    @RequestMapping("/listParamForJson")
    public String listParamForJson(@RequestBody List<String> likes) {
        System.out.println("list common(json)参数传递 list==》" + likes);
        return "{'module':'list common for json param'}";
    }

    /**
     * @Description: POJO参数：Json格式
     * @Param: [likes]
     * @return: [java.util.List<java.lang.String>]
     * @Date: 2022/10/4
     */
    @RequestMapping("/pojoParamForJson")
    public String pojoParamForJson(@RequestBody User user) {
        System.out.println("pojo(json)参数传递 user==》" + user);
        return "{'module':'pojo for json param'}";
    }

    /**
     * @Description: 集合参数：json格式
     * @Param: [users]
     * @return: [java.util.List<com.dx.entity.User>]
     * @Date: 2022/10/4
     */
    @RequestMapping("/listPojoParamForJson")
    public String listPojoParamForJson(@RequestBody List<User> users) {
        System.out.println(" list pojo(json)参数传递 users==》" + users);
        return "{'module':'list pojo for json param'}";
    }

    @RequestMapping("/dateParam")
    public String dateParam(Date date ,
                            @DateTimeFormat(pattern ="yyyy-MM-dd") Date date1,
                            @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss") Date date2) {
        System.out.println(" 参数传递 date==》" + date );
        System.out.println(" 参数传递 date==》" + date1 );
        System.out.println(" 参数传递 date==》" + date2 );
        return "{'module':'date param'}";
    }



}
