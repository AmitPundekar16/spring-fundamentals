package com.amit.spring_mvc_practice_project.service;

import com.amit.spring_mvc_practice_project.model.AddJob;
import com.amit.spring_mvc_practice_project.repository.JobRepo;
import org.springframework.beans.factory.annotation.Autowired;

public class JobService {
   @Autowired
    JobRepo jobrepo;
    public int addjob(AddJob a) {
        return jobrepo.addjob(a);
    }
}
