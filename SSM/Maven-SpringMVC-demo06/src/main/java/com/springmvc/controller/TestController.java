package com.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created with IntelliJ IDEA.
 *
 * @Date: 2022/04/18/18:52
 * @Description:
 */
@Controller
public class TestController {

    @RequestMapping("/")
    public String index(){
        return "index";
    }

}
