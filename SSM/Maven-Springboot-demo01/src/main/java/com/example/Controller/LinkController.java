package com.example.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created with IntelliJ IDEA.
 *
 * @Date: 2022/04/14/19:44
 * @Description:
 */
@Controller
public class LinkController {
    @RequestMapping("/link/test")
    public String doLink(Model model){
        model.addAttribute("myname","张三");
        return "link";
    }
    @RequestMapping("/i18N")
    public String login(){
        return "login";
    }
}
