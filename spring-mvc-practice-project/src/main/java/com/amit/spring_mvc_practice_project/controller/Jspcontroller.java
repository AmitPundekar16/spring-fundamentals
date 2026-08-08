package com.amit.spring_mvc_practice_project.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Jspcontroller {

    @GetMapping({"/","/home"})
    public String home()
    {
        System.out.println("hello");
        return "home.jsp";
    }

    @RequestMapping("/addJob")
    public String AddJob()
    {
        return "AddJob.jsp";
    }

}
