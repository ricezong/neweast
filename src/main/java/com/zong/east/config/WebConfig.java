package com.zong.east.config;

import com.zong.east.interceptor.LoginInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;


/**
 * @ClassName AdminWebConfig
 * @Description TODO
 * @Author 孔明灯
 * @Data 2021/6/9 15:32
 * @Version 1.0
 */

@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        //将拦截器放在容器中
        registry.addInterceptor(new LoginInterceptor())
                .addPathPatterns("/**")//拦截所有路径 静态资源也会被拦截
                .excludePathPatterns("/","/index","/search","/toLogin","/login","/register","/toRegister","/css/**","/js/**","/img/**","/fonts/**");//放行路径  /static/**
    }
}

