package com.itheima.controller;

import com.itheima.domain.Student;
import com.itheima.service.StudentService;
import com.itheima.vo.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
    //如果前端使用的是POST或者PUT发的请求, 需要在参数对象前面强行加入注解@RequestBody
    //添加学生
    @PostMapping("/student")
    public Result save(@RequestBody Student student){
        studentService.save(student);
        return Result.success();
    }
    //根据id查询学生信息
    @GetMapping("/student/{id}")
    public Result findById(@PathVariable("id") Long id) {
        Student student = studentService.findById(id);
        return Result.success(student);
    }
    //修改用户
    @PutMapping("/student")
    public Result update(@RequestBody Student student){
        studentService.update(student);
        return Result.success();
    }
    //删除学生
    @DeleteMapping("/student/{id}")
    public Result deleteById(@PathVariable("id") Long id){
        studentService.deleteById(id);
        return Result.success();
    }
}