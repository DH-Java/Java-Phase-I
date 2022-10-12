package com.dx.controller;

import com.dx.exception.BusinessException;
import com.dx.exception.SystemOutException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * Created with IntelliJ IDEA.
 *
 * @author 67636
 * @Date: 2022/10/06/19:56
 * @Description:
 */

/**
 * @author 67636
 * @Description: 为REST风格开发的控制器类做增强
 * @Param:
 * @return:
 * @Date: 2022/10/6
 */
@RestControllerAdvice
public class ProjectExceptionAdvice {

    @ExceptionHandler(SystemOutException.class)
    public R doSystemOutException(SystemOutException ex) {
        //记录日志
        //发送消息给运维
        //发送邮件给开发人员
        return new R(ex.getCode(), null, ex.getMessage());
    }

    @ExceptionHandler(BusinessException.class)
    public R doBusinessException(BusinessException ex) {
        //记录日志
        //发送消息给运维
        //发送邮件给开发人员
        return new R(ex.getCode(), null, ex.getMessage());
    }

    /**
     * @Description: 设置指定异常的处理方案，功能等同于控制器方法，出现异常后终止原始控制器执行，并转入当前方法执行。
     * @Param: [e]
     * @return: [java.lang.Exception]
     * @Date: 2022/10/6
     */
    @ExceptionHandler(Exception.class)
    public R doException(Exception e) {
        System.out.println("异常你走不掉");
        return new R(Code.SYSTEM_KNOW_ERROR, null, "系统繁忙，请稍后再试");
    }
}
