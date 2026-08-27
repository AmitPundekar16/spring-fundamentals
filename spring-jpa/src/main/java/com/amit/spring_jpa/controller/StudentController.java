package com.amit.spring_jpa.controller;

import com.amit.spring_jpa.Student;
import com.amit.spring_jpa.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

    Student s;
    @Autowired
    StudentService studentService;
    @Autowired
    public StudentController(Student s)
    {
        this.s=s;
    }


    @GetMapping("/add")
    public void addstudent(@RequestBody Student std)
    {
      s.setId(std.getId());
      s.setName(std.getName());
      s.setMarks(std.getMarks());
      System.out.println(std.getName());
      studentService.addstudent(s);
    }
}
