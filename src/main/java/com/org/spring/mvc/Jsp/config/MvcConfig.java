package com.org.spring.mvc.Jsp.config;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Component
public class MvcConfig implements WebMvcConfigurer {
    public void addViewControllers(ViewControllerRegistry registry)
    {

        registry.addViewController("/success").setViewName("success");
        registry.addViewController("/view").setViewName("view");


    }
}