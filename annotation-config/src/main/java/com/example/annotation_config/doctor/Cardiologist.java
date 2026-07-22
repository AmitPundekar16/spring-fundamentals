package com.example.annotation_config.doctor;

import org.springframework.stereotype.Component;

@Component

public class Cardiologist implements Doctor {

    public void gettypeofdoctor()
    {
        System.out.println("i am Cardiologist doctor");
    }
}
