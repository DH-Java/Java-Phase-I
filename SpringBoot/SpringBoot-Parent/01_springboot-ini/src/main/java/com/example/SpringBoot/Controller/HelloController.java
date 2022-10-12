package com.example.SpringBoot.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created with IntelliJ IDEA.
 *
 * @author 67636
 * @Date: 2022/09/26/21:22
 * @Description:
 */
@RestController
public class HelloController {
    @RequestMapping("/ini")
    public String sayHi(){
        return ("Hello SpringBoot 热部署");
    }
}
