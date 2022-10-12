package com.dx.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created with IntelliJ IDEA.
 *
 * @author 67636
 * @Date: 2022/10/02/20:42
 * @Description:
 */
@RestController
public class HelloWorldController {

    @RequestMapping("/hello")
    public String sayHi(){
        System.out.println("Hello World");
        return "Hello World";
    }
}
