package com.company;

import java.util.List;
import java.util.Objects;

public class EmployeeDb {
    Integer id;
    String name;
    String mobile;
    List<String> designation;
    Double salary;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public List<String> getDesignation() {
        return designation;
    }

    public void setDesignation(List<String> designation) {
        this.designation = designation;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public EmployeeDb(Integer id, String name, String mobile, List<String> designation, Double salary) {
        this.id = id;
        this.name = name;
        this.mobile = mobile;
        this.designation = designation;
        this.salary = salary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EmployeeDb that = (EmployeeDb) o;
        return id.equals(that.id) && name.equals(that.name) && mobile.equals(that.mobile) && designation.equals(that.designation) && salary.equals(that.salary);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, mobile, designation, salary);
    }
}
