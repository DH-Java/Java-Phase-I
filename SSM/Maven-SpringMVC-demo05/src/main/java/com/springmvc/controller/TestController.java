package com.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created with IntelliJ IDEA.
 *
 * @Date: 2022/04/18/10:35
 * @Description:
 */
@Controller
public class TestController {
    @RequestMapping("/testInterceptor")
    public String testInterceptor() {
        return "success";
    }
    @RequestMapping("/testSimpleMappingExceptionResolver")
    public String testSimpleMappingExceptionResolver(Exception ex){
        System.out.println(1/0);
        return "success";
    }
}

