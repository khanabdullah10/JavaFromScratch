package com.example.student.controller;


import com.example.student.exception.StudentFailedException;
import com.example.student.exception.SubjectMissingException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api/students")
public class StudentController {


    private final Map<Integer, Map<String, Object>> studentDatabase = new HashMap<>();

    @PostMapping("/insert")
    public ResponseEntity<Object> addStudent(@RequestBody Map<String, Object> student) {


        Integer studentId = (Integer) student.get("studentId");
        String name = (String) student.get("name");

        Map<String, Integer> subjects = (Map<String, Integer>) student.get("subjects");

        if (studentId == null || studentDatabase.containsKey(studentId)) {
            return ResponseEntity.status(HttpStatus.CONFLICT).body("Student ID must be unique");
        }

        if (name == null || name.isEmpty()) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Name cannot be blank");
        }

        if (subjects == null || subjects.isEmpty()) {
            throw new SubjectMissingException();
        }

        if (subjects.values().stream().anyMatch(score -> score < 40)) {
            throw new StudentFailedException();
        }

        int totalMarks = subjects.values().stream().mapToInt(Integer::intValue).sum();
        int subjectCount = subjects.size();
        double average = (double) totalMarks / subjectCount;
        char grade = calculateGrade(average);

        Map<String, Object> response = new HashMap<>();
        response.put("studentId", studentId);
        response.put("name", name.toUpperCase());
        response.put("subjectCount", subjectCount);
        response.put("totalMarks", totalMarks);
        response.put("average", average);
        response.put("grade", grade);

        studentDatabase.put(studentId, response);
        return ResponseEntity.ok(response);
    }

    @GetMapping("id/{id}")
    public ResponseEntity<Object> getStudent(@PathVariable Integer id) {
        Map<String, Object> student = studentDatabase.get(id);
        if (student == null) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Student not found");
        }
        return ResponseEntity.ok(student);
    }

    private char calculateGrade(double average) {
        if (average >= 90) return 'A';
        if (average >= 75) return 'B';
        if (average >= 50) return 'C';
        return 'D';
    }

    @ExceptionHandler(SubjectMissingException.class)
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public String handleSubjectMissingException(SubjectMissingException ex) {
        return ex.getMessage();
    }

    @ExceptionHandler(StudentFailedException.class)
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public String handleStudentFailedException(StudentFailedException ex) {
        return ex.getMessage();
    }


}