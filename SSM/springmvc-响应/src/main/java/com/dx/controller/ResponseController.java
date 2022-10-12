package com.dx.controller;

import com.dx.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


/**
 * Created with IntelliJ IDEA.
 *
 * @author 67636
 * @Date: 2022/10/04/22:49
 * @Description:
 */
@Controller
public class ResponseController {
    //响应页面/跳转页面
    @RequestMapping("/toJumpPage")
    public String toJumpPage() {
        System.out.println("跳转页面");
        return "index.jsp";
    }

    @RequestMapping("/toText")
    @ResponseBody
    public String toText() {
        System.out.println("返回纯文本数据");
        return "response Tetx";
    }

    /**
     * @Description: 响应POJO对象
     * @Param: []
     * @return: []
     * @Date: 2022/10/4
     */
    @RequestMapping("/toJsonPojo")
    @ResponseBody
    public User toJsonPojo(User user) {
        System.out.println("返回json数据对象");
        user.setName("邓豪");
        user.setAge(20);
        return user;
    }

    /**
     * @Description: 响应POJO集合对象
     * @Param: []
     * @return: []
     * @Date: 2022/10/4
     */
    @RequestMapping("/toJsonList")
    @ResponseBody
    public List<User> toJsonList() {
        System.out.println("返回json集合数据对象");
        User user = new User();
        user.setName("邓豪");
        user.setAge(20);

        User user1 = new User();
        user1.setName("邓杰");
        user1.setAge(20);

        ArrayList<User> userlist = new ArrayList<>();
        userlist.add(user);
        userlist.add(user1);
        return userlist;
    }


}
