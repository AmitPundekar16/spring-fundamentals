package com.amit.spring_mvc_practice_project.controller;


import com.amit.spring_mvc_practice_project.model.AddJob;
import com.amit.spring_mvc_practice_project.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Jspcontroller {

    @Autowired
    JobService jobService;
    @GetMapping({"/","/home"})
    public String home()
    {
        System.out.println("hello Home");
        return "home.jsp";
    }

    @RequestMapping("/addJob")
    public String Addjob()
    {System.out.println("hello H1");
        return "AddJob.jsp";
    }

    @PostMapping("/addJob")
    public String Addjob(AddJob a)
    {
        System.out.println("hello H2");
        boolean i=jobService.addjob(a);
        if(i) {
            System.out.println(a.getCompany());
            return "Success.jsp";
        }
        return "/";
    }
}
