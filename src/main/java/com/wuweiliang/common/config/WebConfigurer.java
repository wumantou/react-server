package com.wuweiliang.common.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

@Configuration
public class WebConfigurer extends WebMvcConfigurationSupport {
//    @Autowired
//    private LoginInterceptor loginInterceptor;

    @Value("${myself.file-path}")
    private String filePath;


    // 这个方法是用来配置静态资源的，比如html，js，css，等等
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/**").addResourceLocations("classpath:/static/");
        registry.addResourceHandler("/resource/**").addResourceLocations("file:" + filePath);
//        registry.addResourceHandler("/webjars/**").addResourceLocations("/WEB-INF/webjars/");
    }

    // 这个方法用来注册拦截器，我们自己写好的拦截器需要通过这里添加注册才能生效
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
//        registry.addInterceptor(loginInterceptor).addPathPatterns("/**").excludePathPatterns("/user/sms/**", "/user/login/**", "/webjarslocator/**", "/resource/**");
//        super.addInterceptors(registry);
    }

}