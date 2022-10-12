package com.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created with IntelliJ IDEA.
 *
 * @Date: 2022/04/16/14:26
 * @Description:
 */
@Controller
public class ViewController {
    @RequestMapping("/testThymeleaf")
    public String doThymeleaf() {
        return "success";
    }

    @RequestMapping("/testForward")
    public String doForward() {
        return "forward:testThymeleaf";
    }

    @RequestMapping("/testRedirect")
    public String doRedirect() {
        return "redirect:/testThymeleaf";
    }
}
