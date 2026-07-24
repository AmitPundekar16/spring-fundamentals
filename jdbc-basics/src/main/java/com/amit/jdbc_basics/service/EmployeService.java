package com.amit.jdbc_basics.service;

import com.amit.jdbc_basics.models.Employee;
import com.amit.jdbc_basics.repository.EmployeeRepo;
import org.springframework.stereotype.Service;

@Service
public class EmployeService {

    EmployeeRepo rep;
    public void saveEmployee(Employee s)
    {
        rep.saveEmployee(s);
    }
}
