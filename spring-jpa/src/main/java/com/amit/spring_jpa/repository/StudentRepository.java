package com.amit.spring_jpa.repository;

import com.amit.spring_jpa.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,Integer> {
}
