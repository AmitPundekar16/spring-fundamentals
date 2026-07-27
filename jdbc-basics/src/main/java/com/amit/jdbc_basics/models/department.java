package com.amit.jdbc_basics.models;

import org.springframework.stereotype.Component;

@Component
public class department {
    private int dep_id;
    private String dep_name;
    private int dep_budget;

    public int getDep_id() {
        return dep_id;
    }

    public void setDep_id(int dep_id) {
        this.dep_id = dep_id;
    }

    public String getDep_name() {
        return dep_name;
    }

    public void setDep_name(String dep_name) {
        this.dep_name = dep_name;
    }

    public int getDep_budget() {
        return dep_budget;
    }

    public void setDep_budget(int dep_budget) {
        this.dep_budget = dep_budget;
    }

    @Override
    public String toString() {
        return "department{" +
                "dep_id=" + dep_id +
                ", dep_name='" + dep_name + '\'' +
                ", dep_budget=" + dep_budget +
                '}';
    }
}
