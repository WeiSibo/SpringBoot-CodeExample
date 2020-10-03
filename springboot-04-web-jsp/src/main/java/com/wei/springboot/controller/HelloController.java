package com.wei.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author abo
 * @date 2020/10/3 20:19
 * @remarks
 **/
@Controller
public class HelloController {

    @GetMapping("/abc")
    public String hello(Model model){
        model.addAttribute("msg", "HELLO");
        return "success";
    }
}
