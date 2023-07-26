package com.course.explore.course.exception;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.HttpStatus;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(UserNotFoundException.class)
    public ResponseEntity<ErrorResponse> handleResourceNotFoundException(UserNotFoundException ex) {
        ErrorResponse eObject = new ErrorResponse();
        eObject.setStatus(HttpStatus.NOT_FOUND.value());
        eObject.setMessage(ex.getMessage());
        eObject.setTimestamp(System.currentTimeMillis());
        return new ResponseEntity<ErrorResponse>(eObject, HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(handelNoCourseFound.class)
    public ResponseEntity<ErrorResponse> handleNoHandlerFoundException(handelNoCourseFound ex) {
        ErrorResponse eObject = new ErrorResponse();
        eObject.setStatus(HttpStatus.NOT_FOUND.value());
        eObject.setMessage(ex.getMessage());
        eObject.setTimestamp(System.currentTimeMillis());
        return new ResponseEntity<ErrorResponse>(eObject, HttpStatus.NOT_FOUND);
    }
}
