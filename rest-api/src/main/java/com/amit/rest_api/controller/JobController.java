package com.amit.rest_api.controller;

import com.amit.rest_api.model.Jobs;
import com.amit.rest_api.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class JobController {

    @Autowired
    private JobService jobService;

    @GetMapping("/jobposts")
    public List<Jobs> getAllJobs()
    { System.out.println("hello i am getall controller");
        return jobService.getAllJobs();
    }

    @RequestMapping("/jobpost/{id}")
    public Jobs getJobById(@PathVariable("id")int id)
    {
       return jobService.getJobById(id);
    }

    @PostMapping("/jobpost")
    public Jobs addJob(@RequestBody Jobs j)
    {
        System.out.println("hello i am add job controller");
        return jobService.addJob(j);

    }
}
