package com.example.config;

import org.apache.tomcat.util.descriptor.LocalResolver;
import org.springframework.web.servlet.LocaleResolver;
import org.thymeleaf.util.StringUtils;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Locale;

/**
 * Created with IntelliJ IDEA.
 *
 * @Date: 2022/04/14/20:20
 * @Description:
 */
public class MyLocalResolver implements LocaleResolver {
    @Override
    public Locale resolveLocale(HttpServletRequest request) {
        String lang = request.getParameter("lang");
        Locale locale = request.getLocale();
        if (!StringUtils.isEmpty(lang)){
            String[] data = lang.split("_");
            locale = new Locale(data[0], data[1]);
        }

        return locale;
    }

    @Override
    public void setLocale(HttpServletRequest request, HttpServletResponse response, Locale locale) {

    }
}
