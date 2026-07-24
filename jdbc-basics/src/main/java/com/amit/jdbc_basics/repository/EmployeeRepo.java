package com.amit.jdbc_basics.repository;

import com.amit.jdbc_basics.models.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class EmployeeRepo {

    JdbcTemplate jd;

    @Autowired
    public void setJd(JdbcTemplate jd) {
        this.jd = jd;
    }
    public void saveEmployee(Employee emp)
    {
        String sql="insert into Employee(id,name,department,salary,email)values(?,?,?,?,?)";
        int aff=jd.update(sql,emp.getId(),emp.getName(),emp.getDepartment(),emp.getSalary(),emp.getEmail());
        System.out.println("Data stored successfullly: "+aff);

    }
}
