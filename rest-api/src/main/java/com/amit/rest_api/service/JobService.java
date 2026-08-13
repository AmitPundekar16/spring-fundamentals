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

    public Jobs addJob(Jobs j) {
        System.out.println("hello i am add job from service");
        return jobRepo.addJob(j);

    }

    public boolean deleteJob(int id) {
        System.out.println("hello i am deletejob from service");
        return jobRepo.deleteJob(id);
    }

    public boolean deleteAllJobs() {
        System.out.println("hello i am deleteAlljobs from service");
        return jobRepo.deleteAllJobs();
    }

    public String updateJob(int id, Jobs j) {
        return jobRepo.updateJob(id,j);
    }

    public String updateJob1(int id, Jobs j) {
    }
}
