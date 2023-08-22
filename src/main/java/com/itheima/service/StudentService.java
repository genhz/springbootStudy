package com.itheima.service;

import com.itheima.domain.Student;

import java.util.List;

public interface StudentService {

    //查询所有
    List<Student> findAll();
    void save(Student student);

    Student findById(Long id);

    void update(Student student);

    void deleteById(Long id);
}
