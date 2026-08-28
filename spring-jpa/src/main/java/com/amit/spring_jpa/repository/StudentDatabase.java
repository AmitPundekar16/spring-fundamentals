package com.amit.spring_jpa.repository;

import com.amit.spring_jpa.Student;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class StudentDatabase {

    @Autowired
    StudentRepository sp;
    public void addStudent(Student s)
    {
        System.out.println(sp.getClass());
        sp.save(s);
    }

    public void addAllStudent(List<Student> student) {
        System.out.println(student);
        sp.saveAll(student);
    }

    public Student searchStudentByid(int id) {
        return sp.getReferenceById(id);
    }

    public Student searchStudentByName(String name) {
        return sp.findByName(name);
    }

    @Transactional
    public void deleteByMarks(int marks){
        sp.deleteByMarks(marks);
        System.out.println("record deleted successfully");
    }
}
