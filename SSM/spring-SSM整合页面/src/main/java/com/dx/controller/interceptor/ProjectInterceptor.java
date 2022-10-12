package com.dx.controller.interceptor;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created with IntelliJ IDEA.
 *
 * @author 67636
 * @Date: 2022/10/07/14:54
 * @Description:
 */
@Component
public class ProjectInterceptor implements HandlerInterceptor {

    /**
     * @Description: 返回值是false就拦截但会执行preHandle ，反之就通过
     * @Param: [request, response, handler]
     * @return: [javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse, java.lang.Object]
     * @Date: 2022/10/7
     */
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        return HandlerInterceptor.super.preHandle(request, response, handler);
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        HandlerInterceptor.super.postHandle(request, response, handler, modelAndView);
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        HandlerInterceptor.super.afterCompletion(request, response, handler, ex);
    }
}
