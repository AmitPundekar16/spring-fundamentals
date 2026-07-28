package com.amit.jdbc_basics.repository;

import com.amit.jdbc_basics.models.Employee;
import org.jspecify.annotations.Nullable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Repository
public class DepartmentRepo {

    @Autowired
    JdbcTemplate jd;
    ApplicationContext apk;
    @Autowired
    Employee e;
    public Employee getdepartment(int depId, ApplicationContext apk) {
        this.apk=apk;
        //jd=(JdbcTemplate)apk.getBean("setJd");
        String sql="select * from Department where dep_id=?";

        RowMapper<Employee> rw=new RowMapper() {
            @Override
            public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {

                e.setDep_name(rs.getString("dep_name"));
                e.setDep_budget(rs.getInt("dep_budget"));
                return e;
            }

        };
        System.out.println(e);
       return jd.queryForObject(sql,rw,depId);


    }
}
