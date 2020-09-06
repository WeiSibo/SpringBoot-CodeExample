package com.qlu.sp.dao.impl;

import com.qlu.sp.dao.IStudentDAO;
import com.qlu.sp.domain.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class StudentDAOImpl implements IStudentDAO {

    @Autowired
    JdbcTemplate jdbcTemplate;

    @Override
    public void save(Student student) {
        jdbcTemplate.update("INSERT INTO 计科18 (stuname,stunum,clas,telephone,address,goaddress," +
                "aparttime,returntime,remarks) VALUES (?,?,?,?,?,?,?,?,?)",
                student.getName(), student.getStuNum(), student.getClas(),
                student.getTelephone(), student.getAddress(), student.getGoAddress(),
                student.getApartTime(), student.getReturnTime(), student.getRemarks());
    }

    @Override
    public void update(Student student) {

    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public List<Student> findAll(String cla) {
        return null;
    }
}
