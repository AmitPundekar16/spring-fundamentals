package com.amit.jdbc_basics.service;

import com.amit.jdbc_basics.models.Employee;
import com.amit.jdbc_basics.repository.DepartmentRepo;
import com.amit.jdbc_basics.repository.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeService {
    @Autowired
    EmployeeRepo rep;
    @Autowired
    DepartmentRepo dep;
    public void saveEmployee(Employee s)
    {
        rep.saveEmployee(s);
    }

    public List<Employee> fetchData() {
        return rep.fetchData();
    }

    public Employee fetchSpecific(int id, ApplicationContext apk) {
       Employee em= rep.fetchSpecific(id);
       System.out.println(em.getDep_id());
        return dep.getdepartment(em.getDep_id(),apk);
    }

    public void deletespecificdata(int id) {
        rep.deletespecificrecord(id);
    }

    public void deleteallemployee() {
        rep.deleteallemployee();

    }
}
