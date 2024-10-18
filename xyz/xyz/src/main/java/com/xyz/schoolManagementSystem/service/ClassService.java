package com.xyz.schoolManagementSystem.service;

import com.xyz.schoolManagementSystem.model.Classs;
import com.xyz.schoolManagementSystem.repository.ClassRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ClassService {
    @Autowired
    private ClassRepository classRepository;

    public List<Classs> getAllClasses() {
        return new ArrayList<>(classRepository.getAllClasses());
    }

    public Classs addClass(Classs clazz) {
        classRepository.addClass(clazz);
        return clazz;
    }

    public Classs getClass(String className) {
        return classRepository.getClass(className);
    }

    public void deleteClass(String className) {
        classRepository.deleteClass(className);
    }
}
