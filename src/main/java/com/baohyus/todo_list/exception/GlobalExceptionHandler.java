package com.baohyus.todo_list.exception;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(value = RuntimeException.class)
    public String handleRuntimeException(RuntimeException e) {
        // Log the exception (optional)
        System.err.println("Runtime Exception: " + e.getMessage());
        // Return a user-friendly message
        return "An unexpected error occurred. Please try again later.";
    }
}
