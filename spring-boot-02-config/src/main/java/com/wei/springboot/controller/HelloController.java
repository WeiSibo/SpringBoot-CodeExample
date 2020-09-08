package com.wei.springboot.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author abo
 * @date 2020/9/8 21:01
 * @remarks
 **/
@RestController
public class HelloController {

    @Value("${person.lastName}")
    private String name;

    @GetMapping("/sayHello")
    public String sayHello(){
        return "Hello" +name;
    }
}
