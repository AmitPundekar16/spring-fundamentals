package com.amit.spring_jpa.controller;

import com.amit.spring_jpa.Student;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class StudentController {

    @GetMapping("/add")
    public void addstudent(Student s)
    {

    }
}
