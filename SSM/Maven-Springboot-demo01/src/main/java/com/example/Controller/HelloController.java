package com.example.Controller;

import com.example.entity.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created with IntelliJ IDEA.
 *
 * @Date: 2022/04/14/10:29
 * @Description:
 */
@Controller
public class HelloController {
    @RequestMapping("/hello")
    public String index(Model model){
        model.addAttribute("name","张三");
        return "hello";
    }
    @RequestMapping("/ExpressController")
    public String ExpressController(Model model){
        Student student = new Student();
        student.setName("邓豪");
        student.setSex("男");
        student.setAge(20);
        model.addAttribute("student",student);
        return "express";
    }
}
