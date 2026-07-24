package com.amit.jdbc_basics.repository;

import com.amit.jdbc_basics.models.Employee;
import org.jspecify.annotations.Nullable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

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

    public List<Employee> fetchData() {
        String sql="select * from Employee";
        RowMapper<Employee> rw = new RowMapper<Employee>() {
            @Override
            public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
                Employee e = new Employee();
                e.setId(rs.getInt("id"));
                e.setName(rs.getString("name"));
                e.setDepartment(rs.getString("department"));
                e.setSalary(rs.getInt("salary"));
                e.setEmail(rs.getString("email"));
                return e;
            }
        };

        return jd.query(sql, rw);    }
}
