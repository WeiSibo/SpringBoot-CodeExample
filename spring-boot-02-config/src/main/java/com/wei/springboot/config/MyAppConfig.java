package com.wei.springboot.config;

import com.wei.springboot.bean.Hello;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyAppConfig {

    //将方法的返回值添加到容器中，id为方法名（hello）
    @Bean
    public Hello hello(){
        System.out.println("@Bean给容器中添加组件了...");
        return new Hello();
    }
}
