package com.amit.rest_api.service;

import com.amit.rest_api.model.Jobs;
import com.amit.rest_api.repository.JobRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobService {

    @Autowired
    private JobRepo jobRepo;

    public List<Jobs> getAllJobs() {
        System.out.println("hello i am getall service");
        return jobRepo.getAllJobs();
    }


    public Jobs getJobById(int id) {
        return jobRepo.getJobById(id);
    }
}
