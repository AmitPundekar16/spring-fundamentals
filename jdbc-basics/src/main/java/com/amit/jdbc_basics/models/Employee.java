package com.amit.jdbc_basics.models;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class Employee extends department{
    private int id;
    private String name;



    private int dep_id;

    public int getDep_id() {
        return dep_id;
    }

    public void setDep_id(int dep_id) {
        this.dep_id = dep_id;
    }

    private int salary;
    private String email;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", email='" + email + '\'' +
                ", dep_id=" + getDep_id() +
                ", dep_name='" + getDep_name() + '\'' +
                ", dep_budget=" + getDep_budget() +
                '}';
    }
    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
