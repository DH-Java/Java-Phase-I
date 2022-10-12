package com.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created with IntelliJ IDEA.
 *
 * @Date: 2022/04/16/9:40
 * @Description:
 */
@Controller
public class HelloController {
    @RequestMapping("/")
    public String index() {
        //设置视图名称
        return "index";
    }

    @RequestMapping("/hello")
    public String doHello(Model model){
        String name = "邓豪";
        model.addAttribute("name",name);
        System.out.println("Hello World");
        return "hello";
    }
}
