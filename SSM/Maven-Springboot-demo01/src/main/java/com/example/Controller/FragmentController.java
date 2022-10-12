package com.example.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created with IntelliJ IDEA.
 *
 * @Date: 2022/04/15/14:20
 * @Description:
 */
@Controller
public class FragmentController {
    @RequestMapping("/body/tel")
    public String doTel(Model model){
        model.addAttribute("tplname","menu");
        return "/frag/main";
        //return "frag/tpl";
    }

}
