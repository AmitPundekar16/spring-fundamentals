package com.amit.spring_jpa.repository;

import com.amit.spring_jpa.Student;
import org.springframework.stereotype.Repository;

@Repository
public class StudentDatabase {

    StudentRepository sp;
    public void addStudent(Student s)
    {
        System.out.println(sp.getClass());
      sp.save(s);
    }
}
