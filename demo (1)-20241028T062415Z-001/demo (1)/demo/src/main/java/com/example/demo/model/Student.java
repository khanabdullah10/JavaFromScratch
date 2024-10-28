package com.example.demo.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.Map;

@Getter
@Setter
@AllArgsConstructor
public class Student {
    private int studentId;
    private String name;
    private Map<String, Integer> subjects;

    // Getters and Setters
}
