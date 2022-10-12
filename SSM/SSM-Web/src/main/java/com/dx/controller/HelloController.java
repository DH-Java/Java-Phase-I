package com.dx.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created with IntelliJ IDEA.
 *
 * @author 67636
 * @Date: 2022/10/04/16:26
 * @Description:
 */
@RestController
@RequestMapping("hello")
public class HelloController {

    @RequestMapping("/sayHi")
    public String sayHi(){
        System.out.println("Hello World");
        return "Hello World";
    }
}
