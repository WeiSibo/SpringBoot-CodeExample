package com.qlu.sp.service.impl;

import com.qlu.sp.dao.IStudentDAO;
import com.qlu.sp.domain.Student;
import com.qlu.sp.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements IStudentService {

    @Autowired
    private IStudentDAO dao;

    @Override
    public void save(Student student) {
        dao.save(student);
    }

    @Override
    public void update(Student student) {
        dao.update(student);
    }

    @Override
    public void delete(Long id) {
        dao.delete(id);
    }

    @Override
    public List<Student> findAll(String cla) {
        return dao.findAll(cla);
    }
}
