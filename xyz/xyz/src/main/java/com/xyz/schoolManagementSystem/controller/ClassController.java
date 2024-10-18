package com.xyz.schoolManagementSystem.controller;

import com.xyz.schoolManagementSystem.model.Classs;
import com.xyz.schoolManagementSystem.service.ClassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/classes")
public class ClassController {
    @Autowired
    private ClassService classService;

    @GetMapping
    public List<Classs> getAllClasses() {
        return classService.getAllClasses();
    }

    @PostMapping
    public Classs addClass(@RequestBody Classs clazz) {
        return classService.addClass(clazz);
    }

//    @GetMapping("/{className}")
//    public Classs getClassByName(@PathVariable String className) {
//        return classService.getClassByName(className);
//    }

    @DeleteMapping("/{className}")
    public void deleteClass(@PathVariable String className) {
        classService.deleteClass(className);
    }
}