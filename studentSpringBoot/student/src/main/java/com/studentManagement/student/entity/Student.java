package com.studentManagement.student.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "Student")
public class Student {

    @Id

    private int studentId;

    private String studentname;
    private String address;
    private String city;
    private Double cgpa;
    private Double course_fees;

}
