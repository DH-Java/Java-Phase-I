package com.example.Controller;

import com.example.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;

/**
 * Created with IntelliJ IDEA.
 *
 * @Date: 2022/04/15/15:27
 * @Description:
 */
@Controller
public class inlineController {
    @RequestMapping("/body/inline")
    public String doInline(Model model){
        ArrayList<User> list = new ArrayList<>();
        list.add(new User(1001, "刘备", 30));
        list.add(new User(1002, "关羽", 29));
        list.add(new User(1003, "张飞", 28));
        list.add(new User(1004, "马超", 27));
        list.add(new User(1005, "黄忠", 26));
        model.addAttribute("stulist",list);
        model.addAttribute("name","三国演义");
        model.addAttribute("info","我爱<b>中国</b>");
        return "inline";
    }

}
