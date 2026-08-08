package com.amit.spring_mvc_practice_project.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@Data
@NoArgsConstructor
@AllArgsConstructor
public class AddJob {
    private String title;
    private String company;
    private String location;
    private double salary;
    private int experience;
    private String description;
}
