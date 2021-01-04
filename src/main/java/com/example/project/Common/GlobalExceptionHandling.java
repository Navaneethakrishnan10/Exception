package com.example.project.Common;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandling extends Throwable {
    public GlobalExceptionHandling() {
    }

    @ExceptionHandler
    public ResponseEntity handleException(Exception e) {
        ApiResponse apiResponse = new ApiResponse();
        apiResponse.setError("Id not found...");
        apiResponse.setStatus(HttpStatus.NOT_FOUND.value());
        return ResponseEntity.status(HttpStatus.NOT_FOUND.value()).body(apiResponse);
    }
}


