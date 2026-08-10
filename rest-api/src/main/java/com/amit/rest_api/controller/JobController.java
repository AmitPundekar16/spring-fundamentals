package com.amit.rest_api.controller;

import com.amit.rest_api.model.Jobs;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class JobController {

    @GetMapping("/jobposts")
    public List<Jobs> getAllJobs()
    {
        return
    }
}
