package com.dx.reggie.service.serviceimpl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.dx.reggie.entity.Employee;
import com.dx.reggie.mapper.EmployeeMapper;
import com.dx.reggie.service.EmployeeService;
import org.springframework.stereotype.Service;

/**
 * Created with IntelliJ IDEA.
 *
 * @author 67636
 * @Date: 2022/10/05/17:10
 * @Description:
 */
@Service
public class EmployeeServiceImpl extends ServiceImpl<EmployeeMapper, Employee> implements EmployeeService {
}
