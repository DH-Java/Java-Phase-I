package com.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * Created with IntelliJ IDEA.
 *
 * @author 67636
 * @Date: 2022/04/17/10:56
 * @Description: 使用RESTFul模拟用户资源的增删改查
 * /users GET 查询所有用户信息
 * /user/1 GET 根据id查询用户信息
 * /user  POST 添加用户信息
 * /user/1 DELETE 根据id删除用户信息
 * /user  PUT 修改用户信息
 */
@Controller
@RequestMapping("user")
public class UserController {
    @GetMapping
    public String getAllUser() {
        System.out.println("查询所有用户信息");
        return "success";
    }

    @GetMapping("/{id}")
    public String getUserById() {
        System.out.println("根据id查询用户信息");
        return "success";
    }

    @PostMapping
    public String insertUser(String username, String password) {
        System.out.println("添加用户信息：" + username + ":" + password);
        return "success";
    }
    @PutMapping
    public String updateUser(String username, String password){
        System.out.println("修改用户信息："+username+":"+password);
        return "success";
    }

}
