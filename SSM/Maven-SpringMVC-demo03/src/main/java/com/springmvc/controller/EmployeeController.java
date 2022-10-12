package com.springmvc.controller;

import com.springmvc.dao.EmployeeDao;
import com.springmvc.pojo.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Collection;

/**
 * Created with IntelliJ IDEA.
 *
 * @Date: 2022/04/17/13:28
 * @Description:
 */
@Controller
public class EmployeeController {

    @Autowired
    private EmployeeDao employeeDao;


    @RequestMapping(value = "/employee",method = RequestMethod.GET)
    public String getAllEmployee(Model model){
        Collection<Employee> employeesAll = employeeDao.getAll();
        model.addAttribute("employeesAll",employeesAll);
        return "employee_all";
    }
    @RequestMapping(value = "/employee/{id}" ,method = RequestMethod.DELETE)
    public String deleteEmployeeById(@PathVariable("id") Integer id){
        employeeDao.deleteId(id);
        return "redirect:/employee";
    }
    @RequestMapping(value = "/employee",method = RequestMethod.POST)
    public String insertEmployee(Employee employee){
        employeeDao.insert(employee);
        return "redirect:/employee";
    }
    @RequestMapping(value = "/employee/{id}" ,method = RequestMethod.GET)
    public String getEmployee(@PathVariable("id") Integer id , Model model){
        Employee employee = employeeDao.getId(id);
        model.addAttribute("employee",employee);
        return "update";
    }
    @RequestMapping(value = "/employee" , method = RequestMethod.PUT)
    public String updateEmployee(Employee employee){
        employeeDao.insert(employee);
        return "redirect:/employee";
    }

}
