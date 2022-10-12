package com.springmvc.config;

import org.springframework.web.filter.CharacterEncodingFilter;
import org.springframework.web.filter.HiddenHttpMethodFilter;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import javax.servlet.Filter;

/**
 * Created with IntelliJ IDEA.
 *
 * @Date: 2022/04/18/15:49
 * @Description:web工程的初始化类，用来代替web.xml
 */
public class WebInit extends AbstractAnnotationConfigDispatcherServletInitializer {
    /**
     * @Description: 指定spring的配置类
     * @Param: []
     * @return: []
     * @Date: 2022/4/18
     */
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[]{SpringConfig.class};
    }

    /**
     * @Description: 指定springmvc的配置类
     * @Param: []
     * @return: []
     * @Date: 2022/4/18
     */
    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{WebConfig.class};
    }

    /**
     * @Description: 指定dispatcherServlet的映射规则，即url-pattern
     * @Param: []
     * @return: []
     * @Date: 2022/4/18
     */
    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }
    /**
    * @Description: 注册过滤器
    * @Param: []
    * @return: []
    * @Date: 2022/4/18
    */
    @Override
    protected Filter[] getServletFilters() {
        CharacterEncodingFilter characterEncodingFilter = new CharacterEncodingFilter();
        characterEncodingFilter.setEncoding("UTF-8");
        characterEncodingFilter.setForceRequestEncoding(true);
        HiddenHttpMethodFilter hiddenHttpMethodFilter = new HiddenHttpMethodFilter();
        return new Filter[]{characterEncodingFilter,hiddenHttpMethodFilter};
    }
}
