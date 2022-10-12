package com.springboot.mavenspringboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created with IntelliJ IDEA.
 *
 * @Date: 2022/04/16/20:14
 * @Description:
 */
@RestController
public class HelloController {
    @RequestMapping("/hello")
    public String index(){
        return "hello SpringBoot";
    }
}
