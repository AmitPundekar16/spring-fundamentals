package com.amit.rest_api.model;

public class Jobs {


    private String jobtitle;
    private String companyname;
    private String location;
    private int salary;
    private int experience;
    private String description;


    public Jobs(String jobtitle, String companyname, String location, int salary, int experience, String description) {
        this.jobtitle = jobtitle;
        this.companyname = companyname;
        this.location = location;
        this.salary = salary;
        this.experience = experience;
        this.description = description;
    }

    //    public void setJobtitle(String jobtitle)
//    {
//       this.jobtitle=jobtitle;
//    }
//
//    public String getJobtitle()
//    {
//        return this.jobtitle;
//    }

    public String getJobtitle() {
        return jobtitle;
    }

    public void setJobtitle(String jobtitle) {
        this.jobtitle = jobtitle;
    }

    public String getCompanyname() {
        return companyname;
    }

    public void setCompanyname(String companyname) {
        this.companyname = companyname;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return "Jobs{" +
                "jobtitle='" + jobtitle + '\'' +
                ", companyname='" + companyname + '\'' +
                ", location='" + location + '\'' +
                ", salary=" + salary +
                ", experience=" + experience +
                ", description='" + description + '\'' +
                '}';
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
