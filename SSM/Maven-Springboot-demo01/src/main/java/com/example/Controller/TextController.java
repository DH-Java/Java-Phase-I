package com.example.Controller;

import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created with IntelliJ IDEA.
 *
 * @Date: 2022/04/14/20:53
 * @Description:
 */
@Controller
public class TextController {
    @RequestMapping("/text")
    public String doText(Model model){
        model.addAttribute("info","语言Java 和 go");
        model.addAttribute("n1","张三");
        model.addAttribute("n2","李四");
        return "text";
    }
    @RequestMapping("/num")
    public String doNum(Model model){
        model.addAttribute("n1",100);
        model.addAttribute("n2",20);
        return "num";
    }
    @RequestMapping("/bool")
    public String doBool(Model model){
        model.addAttribute("age",16);
        model.addAttribute("married",true);
        return "bool";
    }
    @RequestMapping("/null")
    public String doNull(Model model){
        model.addAttribute("name",null);
        model.addAttribute("myname","");
        return "null";
    }
    @RequestMapping("/comp")
    public String comp(Model model){
        model.addAttribute("n1",100);
        model.addAttribute("n2",20);
        model.addAttribute("islogin",true);
        return "comp";
    }
    @RequestMapping("/ternary")
    public String ternary(Model model){
        model.addAttribute("age",20);
        model.addAttribute("islogin",true);
        return "ternary";
    }
}
