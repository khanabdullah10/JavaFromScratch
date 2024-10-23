package com.school.controller;

import com.school.model.SchoolClass;
import com.school.model.Student;
import com.school.service.SchoolService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/school")
public class SchoolController {

    @Autowired
    private SchoolService schoolService;

    @GetMapping("/getClasses")
    public List<SchoolClass> getAllClasses() {
        return schoolService.getAllClasses();
    }

    @PostMapping("/addClass")
    public void addClass(@Valid @RequestBody SchoolClass schoolClass) {
        schoolService.addClass(schoolClass);
    }

    @DeleteMapping("/deleteClass/{className}")
    public void deleteClass(@PathVariable String className) {
        schoolService.deleteClass(className);
    }

    @GetMapping("/getClass/{className}")
    public SchoolClass getClassByName(@PathVariable String className) {
        return schoolService.getClassByName(className);
    }

    @PostMapping("/class/{className}/adStudent")
    public void addStudent(@PathVariable String className, @Valid @RequestBody Student student) {
        schoolService.addStudent(className, student);
    }

    @PutMapping("/updateClass/{className}/student")
    public void updateStudent(@PathVariable String className, @Valid @RequestBody Student student) {
        schoolService.updateStudent(className, student);
    }

    @DeleteMapping("/deleteClass/{className}/student/{rollNo}")
    public void deleteStudent(@PathVariable String className, @PathVariable int rollNo) {
        schoolService.deleteStudent(className, rollNo);
    }

    @GetMapping("/getClass/{className}/students")
    public List<Student> getStudentsByClass(@PathVariable String className) {
        return schoolService.getClassByName(className).getStudents();
    }

    @GetMapping("/getStudents/{subject")
    public List<Student> getStudentsBySubject(@RequestParam(required = false) String subject) {
        return schoolService.getStudentsBySubject(subject);
    }

    @GetMapping("/getStudents/birth-year/{year}")
    public List<Student> getStudentsByBirthYear(@PathVariable int year) {
        return schoolService.getStudentsByBirthYear(year);
    }

    @GetMapping("/countStudents")
    public Map<String, Integer> countStudentsInClasses() {
        return schoolService.countStudentsInClasses();
    }
}
