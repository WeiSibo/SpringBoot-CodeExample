package com.qlu.sp.controller;

import com.qlu.sp.domain.Student;
import com.qlu.sp.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private IStudentService service;

    @RequestMapping("/saveOrUpdate")
    public String saveOrUpdate(Student student) {
        System.out.println("保存");
        if (student.getId() == null) {
            service.save(student);
        } else {
            service.update(student);
        }
        return "保存成功";
    }
}
