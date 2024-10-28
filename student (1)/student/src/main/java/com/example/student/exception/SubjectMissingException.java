package com.example.student.exception;

public  class SubjectMissingException extends RuntimeException {
    public SubjectMissingException() {
        super("Student was on leave during exam session");
    }
}
