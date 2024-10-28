package com.example.student.exception;

public  class StudentFailedException extends RuntimeException {
    public StudentFailedException() {
        super("Student failed the exam");
    }
}
