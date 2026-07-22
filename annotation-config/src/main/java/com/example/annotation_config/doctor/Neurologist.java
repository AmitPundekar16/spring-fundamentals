package com.example.annotation_config.doctor;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Neurologist  implements Doctor{
    public void gettypeofdoctor()
    {
        System.out.println("i am Neurologist doctor");
    }
}
