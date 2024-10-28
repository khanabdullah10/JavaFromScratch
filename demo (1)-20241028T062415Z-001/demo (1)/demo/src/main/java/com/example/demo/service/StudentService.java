package com.example.demo.service;

import com.example.demo.exception.StudentException;
import com.example.demo.model.Student;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class StudentService {

    private final Map<Integer, Student> studentDatabase = new HashMap<>();

    public Map<String, Object> processStudentDetails(Student student) {


        if (studentDatabase.containsKey(student.getStudentId())) {
            throw new StudentException("Student ID must be unique", 500);
        }

        validateStudentData(student);

        int totalMarks = student.getSubjects().values().stream().mapToInt(Integer::intValue).sum();
        double averageMarks = totalMarks / (double) student.getSubjects().size();
        char grade = calculateGrade(averageMarks);

        Map<String, Object> response = new HashMap<>();
        response.put("studentId", student.getStudentId());
        response.put("name", student.getName().toUpperCase());
        response.put("subjectCount", student.getSubjects().size());
        response.put("totalMarks", totalMarks);
        response.put("average", Math.round(averageMarks * 100.0) / 100.0);
        response.put("grade", grade);

        studentDatabase.put(student.getStudentId(), student);
        return response;
    }

    public Student getStudent(Integer id) {
        return studentDatabase.getOrDefault(id, null);
    }

    private void validateStudentData(Student student) {
        if (student.getSubjects() == null || student.getSubjects().isEmpty()) {
            throw new StudentException("Student was on leave during exam session", 500);
        }

        for (Integer marks : student.getSubjects().values()) {
            if (marks < 40) {
                throw new StudentException("Student failed the exam", 500);
            }
        }
    }

    private char calculateGrade(double average) {
        if (average >= 90) return 'A';
        else if (average >= 80) return 'B';
        else if (average >= 70) return 'C';
        else if (average >= 60) return 'D';
        else return 'F';
    }
}
