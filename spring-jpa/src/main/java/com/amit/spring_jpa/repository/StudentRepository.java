package com.amit.spring_jpa.repository;

import com.amit.spring_jpa.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface StudentRepository extends JpaRepository<Student,Integer> {
    Student findByName(String name);


   void  deleteByMarks(int marks);
}
