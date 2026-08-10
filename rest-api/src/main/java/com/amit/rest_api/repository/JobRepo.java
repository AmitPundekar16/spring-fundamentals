package com.amit.rest_api.repository;

import com.amit.rest_api.model.Jobs;
import org.springframework.stereotype.Repository;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
@Repository
public class JobRepo {

    List<Jobs> j1=new ArrayList<>(Arrays.asList(
            new Jobs(1,"Java Developer", "Infosys", "Pune", 500000, 2, "Backend role"),
            new Jobs(2,"Data Analyst", "TCS", "Mumbai", 450000, 1, "Analyzing business data and generating reports"),
            new Jobs(3,"Frontend Developer", "Wipro", "Bangalore", 480000, 2, "Building UI using React and Angular"),
            new Jobs(4,"DevOps Engineer", "Accenture", "Hyderabad", 600000, 3, "CI/CD pipelines and cloud infrastructure"),
            new Jobs(5,"QA Engineer", "Cognizant", "Chennai", 400000, 1, "Manual and automation testing"),
            new Jobs(6,"Full Stack Developer", "Capgemini", "Pune", 550000, 2, "End-to-end web application development")
    )
                    );

    public List<Jobs> getAllJobs() {
        System.out.println("hello i am getall repo");
        return j1;
    }

    public Jobs getJobById(int id) {
        for(Jobs j:j1)
        {
            if(j.getJobid()==id)
            {
                return j;
            }
        }
        return null;
    }
}
