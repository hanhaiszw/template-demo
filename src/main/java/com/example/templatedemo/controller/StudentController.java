package com.example.templatedemo.controller;

import com.example.templatedemo.bean.Student;
import org.springframework.web.bind.annotation.*;

/**
 * create by sunzhongwei on 2020/06/17
 * Desc: 学生管理接口
 */
@RestController
public class StudentController {

    /**
     * 测试
     * @return
     */
    @GetMapping("/test1")
    public String test1(){
        return "hello";
    }



    /**
     * 添加学生
     * @param student 学生信息
     * @return
     */
    @PostMapping("/addStudent")
    public Student addStudent(@RequestBody Student student){
        return student;
    }
}
