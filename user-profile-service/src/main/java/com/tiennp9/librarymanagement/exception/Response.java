package com.tiennp9.librarymanagement.exception;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.http.HttpStatus;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
public class Response {
    protected boolean result;
    protected HttpStatus status;
    protected String error_code;
    protected String msg;
    protected Date timestamp;
    protected String details;
}