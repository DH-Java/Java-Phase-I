package com.springmvc.dao;

import com.springmvc.pojo.Employee;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 *
 * @Date: 2022/04/17/13:23
 * @Description:
 */
@Repository
public class EmployeeDao {
    private static Map<Integer, Employee> employees = null;

    static {
        employees = new HashMap<>();

        employees.put(1001, new Employee(1001, "E-AA", "aa@163.com", 1));
        employees.put(1002, new Employee(1002, "E-BB", "bb@163.com", 1));
        employees.put(1003, new Employee(1003, "E-CC", "cc@163.com", 0));
        employees.put(1004, new Employee(1004, "E-DD", "dd@163.com", 0));
        employees.put(1005, new Employee(1005, "E-EE", "ee@163.com", 1));
    }

    private static Integer initId = 1006;

    /**
     * @Description: 添加用户
     * @Param: [employee]
     * @return: [com.springmvc.pojo.Employee]
     * @Date: 2022/4/17
     */
    public void insert(Employee employee) {
        if (employee.getId() == null) {
            employee.setId(initId++);
        }
        employees.put(employee.getId(), employee);
    }

    /**
     * @Description: 查询所有用户
     * @Param: []
     * @return: []
     * @Date: 2022/4/17
     */
    public Collection<Employee> getAll() {
        return employees.values();
    }

    /**
     * @Description: 根据id查询用户
     * @Param: [id]
     * @return: [java.lang.Integer]
     * @Date: 2022/4/17
     */
    public Employee getId(Integer id) {
        return employees.get(id);
    }

    /**
     * @Description: 根据id删除用户
     * @Param: [id]
     * @return: [java.lang.Integer]
     * @Date: 2022/4/17
     */
    public void deleteId(Integer id) {
        employees.remove(id);
    }
}
