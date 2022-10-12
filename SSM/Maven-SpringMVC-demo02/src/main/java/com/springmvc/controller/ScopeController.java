package com.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 *
 * @Date: 2022/04/16/12:23
 * @Description:
 */
@Controller
public class ScopeController {
    @RequestMapping("/testServletAPI")
    public String doTestServletApi(HttpServletRequest request) {
        request.setAttribute("testRequestScope", "hello ServletAPI");
        return "success";
    }

    @RequestMapping("/testModelAndView")
    public ModelAndView doModelAndView(ModelAndView modelAndView) {
        //处理模型数据,即向请求与request共享数据
        modelAndView.addObject("testRequestScope", "Hello ModelAndView");
        //设置视图名称
        modelAndView.setViewName("success");
        return modelAndView;
    }

    @RequestMapping("/testModel")
    public String doModel(Model model) {
        model.addAttribute("testRequestScope", "hello model");
        System.out.println(model);
        return "success";
    }

    @RequestMapping("/testMap")
    public String doMap(Map<String, Object> map) {
        map.put("testRequestScope", "hello map");
        System.out.println(map);
        return "success";
    }

    @RequestMapping("/testModelMap")
    public String doModelMap(ModelMap modelMap) {
        modelMap.put("testRequestScope", "hello ModelMap");
        System.out.println(modelMap.getClass().getName());
        return "success";
    }

    @RequestMapping("/testSession")
    public String doSession(HttpSession session) {
        session.setAttribute("testSessionScope", "hello session");
        return "success";
    }
    @RequestMapping("/testApplication")
    public String doApplication(HttpSession session){
        ServletContext application = session.getServletContext();
        application.setAttribute("testApplication","hello Application");
        return "success";
    }
}
