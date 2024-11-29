package com.studentManagement.student.controller;
import com.studentManagement.student.entity.Student;
import com.studentManagement.student.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class StudentController {

    @Autowired
    private StudentService studentService;

    // Add Student
    @PostMapping("/add")
    public ResponseEntity<String> addStudent(@RequestBody Student student) {
        Student addedStudent = studentService.addStudent(student);
        return ResponseEntity.status(201).body("Student added Successfully"); // 201 Created
    }

    // Get All Students
    @GetMapping("/view")
    public ResponseEntity<List<Student>> getAllStudents() {
        List<Student> students = studentService.getAllStudents();
        if (students.isEmpty()) {
            return ResponseEntity.noContent().build(); // 204 No Content
        }
        return ResponseEntity.ok(students); // 200 OK
    }

    // Get Student by ID
    @GetMapping("/{id}")
    public ResponseEntity<Student> getStudentById(@PathVariable("id") Integer studentId) {
        Optional<Student> student = studentService.getStudentById(studentId);
        return student.map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build()); // 404 Not Found
    }

    // Get Students by City and CGPA
    @GetMapping("/city-cgpa")
    public ResponseEntity<List<Student>> getStudentsByCityAndCgpa(
            @RequestParam("city") String city,
            @RequestParam("cgpa") Double cgpa) {
        List<Student> students = studentService.getStudentsByCityAndCgpa(city, cgpa);
        if (students.isEmpty()) {
            return ResponseEntity.noContent().build(); // 204 No Content
        }
        return ResponseEntity.ok(students); // 200 OK
    }

    // Reduce Fees for Students with CGPA = 10
    @PutMapping("/reduce-fees")
    public ResponseEntity<String> reduceFeesForTopStudents() {
        studentService.reduceFeesForTopStudents();
        return ResponseEntity.ok("Fees reduced for students with CGPA = 10"); // 200 OK
    }

    // Delete Student by ID
    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteStudent(@PathVariable("id") Integer studentId) {
        studentService.deleteStudentById(studentId);
        return ResponseEntity.ok("Deleted successfully"); // 204 No Content
    }
}