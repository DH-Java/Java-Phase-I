package com.springmvc.controller;

import com.springmvc.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;

/**
 * Created with IntelliJ IDEA.
 *
 * @Date: 2022/04/16/10:11
 * @Description:
 */
@Controller
public class PoJoController {
    @RequestMapping("/testpojo")
    public String doTestPoJo(User user){
        System.out.println(user);
        return "testpojo";
    }

}
