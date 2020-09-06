package com.qlu.sp.service;

import com.qlu.sp.domain.Student;

import java.util.List;

public interface IStudentService {
    void save(Student student);
    void update(Student student);
    void delete(Long id);
    List<Student> findAll(String cla);
}
