package com.dx.controller;

import com.dx.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 *
 * @Date: 2022/04/13/9:31
 * @Description:控制器类
 */
@RequestMapping(path = "/controller")
@Controller
//入门案例
public class HelloController {
    @RequestMapping(path = "/hello")
    //请求资源绑定
    public String top(String user, Integer password) {
        System.out.println("hello");
        System.out.println(user + password);
        return "success";
    }

    @RequestMapping(path = "/testRequestMapping")
    public String TestRequestMapping() {
        System.out.println("测试RequestMapping注解");
        return "success";
    }

    /**
     * @Description: 请求参数绑定把数据封装到JavaBean的类中
     * @Param: [user]
     * @return: [com.dx.domain.User]
     * @Date: 2022/4/13
     */
    @RequestMapping(path = "/login")
    public String logIn(User user) {
        System.out.println(user);
        return "success";
    }

    @RequestMapping("/request")
    public String testRequest(
            @RequestParam(value = "user") String username,
            @RequestParam("pass") String password,
            String[] hobby) {
        //若请求参数中出现多个同名的请求参数，可以在控制方法的形参位置设置一个字符串类型或字符串数组接受此请求参数
        //若使用字符串类型形参，最终结果为请求参数的每一个值之间使用逗号进行拼接
        System.out.println(username + password+ Arrays.toString(hobby));
        return "success";
    }
}
