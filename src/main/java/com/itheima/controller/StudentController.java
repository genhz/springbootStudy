package com.itheima.controller;

import com.itheima.domain.Student;
import com.itheima.service.StudentService;
import com.itheima.vo.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    private StudentService studentService;

    //查询学生
//    @GetMapping("/student")
//    public List<Student> findAll(){
//        List<Student> studentList = studentService.findAll();
//        return studentList;
//    }
    @GetMapping("/student")
    public Result findAll(){
        List<Student> studentList = studentService.findAll();
        return Result.success(studentList);
    }
}