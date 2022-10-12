package com.example.Controller;

import com.example.entity.Student;
import com.example.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 *
 * @Date: 2022/04/15/9:45
 * @Description:
 */
@Controller
public class BodyController {
    @RequestMapping("/body/text")
    public String body(Model model){
        model.addAttribute("msg","学习的开发语言<b>Java</b>");
        model.addAttribute("content","全栈开发<b>vue</b>,<b>Java</b>,<b>mysql</b>");
        return "body";
    }
    @RequestMapping("/body/each")
    public String doEach(Model model){
        ArrayList<User> list = new ArrayList<>();
        list.add(new User(1001, "刘备", 30));
        list.add(new User(1002, "关羽", 29));
        list.add(new User(1003, "张飞", 28));
        list.add(new User(1004, "马超", 27));
        list.add(new User(1005, "黄忠", 26));
        model.addAttribute("user",list);

        //创建map
        HashMap<String,String> map = new HashMap<>();
        map.put("id","1001");
        map.put("姓名","张三");
        map.put("年龄","20");
        map.put("班级","Java");
        model.addAttribute("map",map);

        //lits<Map<String,User>>
        ArrayList<Map<String , User>> list1 = new ArrayList<>();
        HashMap<String, User> map1 = new HashMap<>();
        map1.put("stu-1-1",new User(101,"诸葛亮",30));
        map1.put("stu-1-2",new User(102,"司马懿",32));
        list1.add(map1);


        map1 = new HashMap<>();
        map1.put("stu-2-1",new User(201,"曹操",35));
        map1.put("stu-2-2",new User(202,"孙权",34));
        map1.put("stu-2-3",new User(203,"孙策",36));
        list1.add(map1);
        model.addAttribute("listmap",list1);


        String[] names = {"李白","杜甫","王维"};
        model.addAttribute("names",names);

        //给select创建数据
        HashMap<String, String> cirty = new HashMap<>();
        cirty.put("010","北京");
        cirty.put("021","上海");
        cirty.put("022","天津");
        cirty.put("023","重庆");
        model.addAttribute("cirty",cirty);

        model.addAttribute("choice","北京");
        return "each";
    }
    @RequestMapping("/body/if")
    public String doIf(Model model){
        //true
        model.addAttribute("old",true);
        model.addAttribute("login","login");
        model.addAttribute("num1",10);
        model.addAttribute("num2",-2);
        model.addAttribute("obj1",new Student());
        model.addAttribute("str0","");

        //false
        model.addAttribute("yong",false);
        model.addAttribute("str1","off");
        model.addAttribute("str2","no");
        model.addAttribute("str3","false");
        model.addAttribute("num3",0);
        model.addAttribute("obj2",null);
        return "if";
    }
    @RequestMapping("/body/var")
    public String doVar(Model model){
        model.addAttribute("age",20);
        return "var";
    }
    @RequestMapping("/body/toolsobject")
    public String doToolsobject(Model model){
        model.addAttribute("myname","zhangsan");
        model.addAttribute("mydate",new Date());
        model.addAttribute("price",89.35);
        return "toolsobject";

    }
    @RequestMapping("/body/inobject")
    public String doInObject(Model model, HttpSession session){
        model.addAttribute("attrName","我是request作用域中的数据AttrValue");
        session.setAttribute("sessionAttr","我是session中的数据");
        ServletContext context = session.getServletContext();
        context.setAttribute("contextAttr","我是servletContext中的数据");
        return "inobject";
    }
}
