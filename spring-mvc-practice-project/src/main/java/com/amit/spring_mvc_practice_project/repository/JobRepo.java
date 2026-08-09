package com.amit.spring_mvc_practice_project.repository;

import com.amit.spring_mvc_practice_project.model.AddJob;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Repository
public class JobRepo {
    List<AddJob> j1=new ArrayList<AddJob>(Arrays.asList(
            new AddJob("Java Developer", "Infosys", "Pune", 500000, 2, "Backend role"),
            new AddJob("Data Analyst", "TCS", "Mumbai", 450000, 1, "Analyzing business data and generating reports"),
            new AddJob("Frontend Developer", "Wipro", "Bangalore", 480000, 2, "Building UI using React and Angular"),
            new AddJob("DevOps Engineer", "Accenture", "Hyderabad", 600000, 3, "CI/CD pipelines and cloud infrastructure"),
            new AddJob("QA Engineer", "Cognizant", "Chennai", 400000, 1, "Manual and automation testing"),
            new AddJob("Full Stack Developer", "Capgemini", "Pune", 550000, 2, "End-to-end web application development")            )
    );
    public int addjob(AddJob a) {
        return 1;
    }
}
