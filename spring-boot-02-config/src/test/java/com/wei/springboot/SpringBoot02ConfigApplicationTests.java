package com.wei.springboot;

import com.wei.springboot.bean.Hello;
import com.wei.springboot.bean.Person;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
/*
* SpringBoot单元测试
*
* 可以在测试期间很方便的进行自动注入等容器的功能
* */

@SpringBootTest
class SpringBoot02ConfigApplicationTests {

    @Autowired
    private Person person;

    @Autowired
    private ApplicationContext ioc;

    @Test
    void testHello(){
        boolean b = ioc.containsBean("hello");
        System.out.println(b);
        Hello hello = (Hello) ioc.getBean("hello");
        if(hello != null){
            System.out.println(hello);
        }
    }

    @Test
    void contextLoads() {
        System.out.println(person);
    }
}
