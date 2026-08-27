package com.amit.spring_jpa.service;

import com.amit.spring_jpa.Student;
import com.amit.spring_jpa.repository.StudentDatabase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    StudentDatabase sd;
    public void addstudent(Student s) {
       sd.addStudent(s);
    }

    public void addAllStudent(List<Student> student) {
        sd.addAllStudent(student);
    }

    public Student searchStudent(int id) {
        return sd.searchStudentByid(id);
    }

    public Student searchByName(String name) {
        return sd.searchStudentByName(name);
    }
}
