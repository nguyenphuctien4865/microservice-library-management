package com.tiennp9.librarymanagement.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;

import java.util.Date;

@RestControllerAdvice
public class CustomExceptionHandle {
    @ExceptionHandler(AppException.class)
    public final ResponseEntity<ErrorResponse> handleAppException(AppException exception) {
        return buildErrorResponse(exception);
    }

    @ExceptionHandler(ResourceNotFoundException.class)
    public final ResponseEntity<ErrorResponse> handleResourceNotFound(ResourceNotFoundException exception, WebRequest webRequest){
        ErrorResponse errorResponse = new ErrorResponse();
        errorResponse.setMsg(exception.getMessage());
        errorResponse.setTimestamp(new Date());
        errorResponse.setDetails(webRequest.getDescription(false));
        return new ResponseEntity<>(errorResponse, HttpStatus.NOT_FOUND);
    }

    private ResponseEntity<ErrorResponse> buildErrorResponse(AppException exception) {
//        log.error("Exception occurred: Code: {}, Message: {}, Status: {}",
//                exception.getCode(),
//                exception.getMsg(),
//                exception.getStatus(),
//                exception); // Logs full stack trace

        ErrorResponse response = new ErrorResponse(exception);
        return ResponseEntity
                .status(exception.getStatus())
                .body(response);
    }
}
