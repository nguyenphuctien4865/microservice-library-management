package com.tiennp9.librarymanagement.exception;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.http.HttpStatus;

@Getter
@Setter
@NoArgsConstructor
public class AppException extends Exception {
    protected String code;
    protected String msg;
    protected String stack;
    protected HttpStatus status;
}