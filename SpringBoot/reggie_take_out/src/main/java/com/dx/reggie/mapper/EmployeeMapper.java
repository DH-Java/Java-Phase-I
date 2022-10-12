package com.dx.reggie.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.dx.reggie.entity.Employee;
import org.apache.ibatis.annotations.Mapper;

/**
 * Created with IntelliJ IDEA.
 *
 * @author 67636
 * @Date: 2022/10/05/17:08
 * @Description:
 */
@Mapper
public interface EmployeeMapper extends BaseMapper<Employee> {
}
