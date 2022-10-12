package com.example.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created with IntelliJ IDEA.
 *
 * @Date: 2022/04/15/9:10
 * @Description:
 */
@Controller
public class AttrController {
    @RequestMapping("/attr")
    public String doattr(Model model){
        model.addAttribute("myaction","/user/login");
        model.addAttribute("mytext","请登录");

        model.addAttribute("selected",true);
        model.addAttribute("unselected",false);
        return "attr";
    }
}
