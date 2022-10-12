package com.dx.controller;

import com.dx.entity.User;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @author 67636
 * @Date: 2022/10/02/21:57
 * @Description:
 */
@RestController
public class UserController {

    @RequestMapping(value = "/users", method = RequestMethod.POST)
    public String save() {
        System.out.println("user save");
        return "{module :  User save.....}";
    }

    @RequestMapping(value = "/users/{id}", method = RequestMethod.DELETE)
    public String delete(@PathVariable Integer id) {
        System.out.println("user delete ==> " + id);
        return "{module : user delete}";
    }


    @RequestMapping(value = "/users", method = RequestMethod.PUT)
    public String update(@RequestBody User user) {
        System.out.println("user update... ==> " + user);
        return "{module : user update}";
    }

    @RequestMapping(value = "/users/{id}", method = RequestMethod.GET)
    public String getById(@PathVariable Integer id) {
        System.out.println("user getById       ：" + id);
        return "{'module':'user geyById'}";
    }

    @RequestMapping(value = "/users", method = RequestMethod.GET)
    public String getAll() {
        System.out.println("user getAll");
        return "{'module':'user getAll'}";
    }

}
