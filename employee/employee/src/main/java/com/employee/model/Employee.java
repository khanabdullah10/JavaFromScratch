package com.employee.model;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Employee {
    private  Long id;
    private String name;

    public Employee(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Employee ID : " + id +
                ", Employee Name" + name + '\'';
    }
}
