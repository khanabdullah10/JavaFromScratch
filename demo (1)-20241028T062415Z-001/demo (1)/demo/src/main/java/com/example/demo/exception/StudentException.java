package com.example.demo.exception;

public class StudentException extends RuntimeException {
    private final int statusCode;

    public StudentException(String message, int statusCode) {
        super(message);
        this.statusCode = statusCode;
    }

    public int getStatusCode() {
        return statusCode;
    }
}
