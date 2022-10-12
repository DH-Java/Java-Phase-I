package com.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created with IntelliJ IDEA.
 *
 * @Date: 2022/04/16/11:28
 * @Description:
 */
@Controller
public class HelloController {
/*    @RequestMapping("/")
    public String index(){
        return "index";
    }*/
    @RequestMapping("/thy")
    public String thy(){
        return "thymeleaf";
    }
}
