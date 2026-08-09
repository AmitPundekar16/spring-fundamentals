package com.amit.spring_mvc_practice_project.service;

import com.amit.spring_mvc_practice_project.model.AddJob;
import com.amit.spring_mvc_practice_project.repository.JobRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobService {
   @Autowired
    JobRepo jobrepo;
    public boolean addjob(AddJob a) {
        return jobrepo.addjob(a);
    }

    public List<AddJob> getalljobs() {
        return jobrepo.getalljobs();
    }
}
