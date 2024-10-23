package com.school.service;

import com.school.model.SchoolClass;
import com.school.model.Student;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

@Service
public class SchoolService {
    private final Map<String, SchoolClass> classes = new HashMap<>();

    public List<SchoolClass> getAllClasses() {
        return new ArrayList<>(classes.values());
    }

    public void addClass(SchoolClass schoolClass) {
        if (classes.containsKey(schoolClass.getClassName())) {
            throw new RuntimeException("Class already exists");
        }
        classes.put(schoolClass.getClassName(), schoolClass);
    }

    public void deleteClass(String className) {
        if (!classes.containsKey(className)) {
            throw new RuntimeException("Class not found");
        }
        classes.remove(className);
    }

    public SchoolClass getClassByName(String className) {
        if (!classes.containsKey(className)) {
            throw new RuntimeException("Class not found");
        }
        return classes.get(className);
    }

    public void addStudent(String className, Student student) {
        SchoolClass schoolClass = getClassByName(className);
        for (Student s : schoolClass.getStudents()) {
            if (s.getRollNo() == student.getRollNo()) {
                throw new RuntimeException("Student roll number already exists");
            }
        }
        schoolClass.getStudents().add(student);
    }

    public void updateStudent(String className, Student student) {
        SchoolClass schoolClass = getClassByName(className);
        boolean studentUpdated = false;
        for (int i = 0; i < schoolClass.getStudents().size(); i++) {
            if (schoolClass.getStudents().get(i).getRollNo() == student.getRollNo()) {
                schoolClass.getStudents().set(i, student);
                studentUpdated = true;
                break;
            }
        }
        if (!studentUpdated) {
            throw new RuntimeException("Student not found");
        }
    }

    public void deleteStudent(String className, int rollNo) {
        SchoolClass schoolClass = getClassByName(className);
        schoolClass.getStudents().removeIf(s -> s.getRollNo() == rollNo);
    }

    public List<Student> getStudentsBySubject(String subject) {
        List<Student> students = new ArrayList<>();
        for (SchoolClass schoolClass : classes.values()) {
            for (Student student : schoolClass.getStudents()) {
                if (subject == null || student.getSubjects().contains(subject)) {
                    students.add(student);
                }
            }
        }
        return students;
    }

    public List<Student> getStudentsByBirthYear(int year) {
        List<Student> students = new ArrayList<>();
        for (SchoolClass schoolClass : classes.values()) {
            for (Student student : schoolClass.getStudents()) {
                LocalDate dob = LocalDate.parse(student.getDateOfBirth(), DateTimeFormatter.ofPattern("dd-MM-yyyy"));
                if (dob.getYear() == year) {
                    students.add(student);
                }
            }
        }
        return students;
    }


    public Map<String, Integer> countStudentsInClasses() {
        Map<String, Integer> classStudentCount = new HashMap<>();
        List<SchoolClass> classes = getAllClasses();

        for (SchoolClass schoolClass : classes) {
            classStudentCount.put(schoolClass.getClassName(), schoolClass.getStudents().size());
        }

        return classStudentCount;
    }


}
