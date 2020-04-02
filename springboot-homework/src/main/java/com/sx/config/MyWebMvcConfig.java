package com.sx.config;

import com.sx.intercept.LoginIntercept;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author shengx
 * @date 2020/4/2 20:51
 */
@Configuration
public class MyWebMvcConfig implements WebMvcConfigurer {

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new LoginIntercept())
                .addPathPatterns("/**")
                .excludePathPatterns("/login/**", "index.html", "login.html")
                .excludePathPatterns("/assets/**");
    }
}
