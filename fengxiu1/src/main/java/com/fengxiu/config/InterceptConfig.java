package com.fengxiu.config;

import com.fengxiu.intercept.PermissIntercept;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;


@Configuration
public class InterceptConfig implements WebMvcConfigurer {


    //交给容器管理
    @Bean
    public PermissIntercept getpermissintercept()
    {
        return  new PermissIntercept();
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {

        registry.addInterceptor(getpermissintercept());

    }
}
