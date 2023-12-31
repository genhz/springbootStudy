package com.itheima.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.itheima.domain.Student;
import com.itheima.mapper.StudentMapper;
import com.itheima.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentMapper studentMapper;

    @Override
    public List<Student> findAll() {
        LambdaQueryWrapper<Student> wrapper = new LambdaQueryWrapper<>();
        return studentMapper.selectList(wrapper);
    }

    @Override
    public void save(Student student) {
        studentMapper.insert(student);
    }

    @Override
    public Student findById(Long id) {
        return studentMapper.selectById(id);
    }

    @Override
    public void update(Student student) {
        studentMapper.updateById(student);
    }

    @Override
    public void deleteById(Long id) {
        studentMapper.deleteById(id);
    }
}