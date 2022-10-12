package com.dx.config;

import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;

import org.springframework.web.servlet.support.AbstractDispatcherServletInitializer;

/**
 * Created with IntelliJ IDEA.
 *
 * @author 67636
 * @Date: 2022/10/02/20:44
 * @Description:第一种方法
 */

/**
 * @author 67636
 * @Description: 定义一个servlet容器启动的配置类，在里面加载spring的配置 前端控制器
 * @Param:
 * @return:
 * @Date: 2022/10/2
 */
public class DispatcherServlet extends AbstractDispatcherServletInitializer {


    /**
     * @Description: 加载springmvc容器配置
     * @Param: []
     * @return: []
     * @Date: 2022/10/2
     */
    @Override
    protected WebApplicationContext createServletApplicationContext() {
        AnnotationConfigWebApplicationContext webApplicationContext = new AnnotationConfigWebApplicationContext();
        webApplicationContext.register(springMvcConfig.class);
        return webApplicationContext;
    }

    /**
     * @Description:设置那些请求归属springmvc处理
     * @Param: []
     * @return: []
     * @Date: 2022/10/2
     */
    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }

    //加载spring容器配置
    @Override
    protected WebApplicationContext createRootApplicationContext() {
        AnnotationConfigWebApplicationContext webApplicationContext = new AnnotationConfigWebApplicationContext();
        webApplicationContext.register(springConfig.class);
        return webApplicationContext;
    }

/**
 AbstractAnnotationConfigDispatcherServletInitializer这是AbstractDispatcherServletInitializer的子类，可以简化开发
 @Override protected Class<?>[] getRootConfigClasses() {
 return new Class[]{springConfig.class};
 }

 @Override protected Class<?>[] getServletConfigClasses() {
 return new Class[]{springMvcConfig.class};
 }

 @Override protected String[] getServletMappings() {
 return new String[]{"/"};
 }
 */
}
