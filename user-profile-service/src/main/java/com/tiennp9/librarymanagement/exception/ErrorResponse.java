package com.tiennp9.librarymanagement.exception;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class ErrorResponse extends Response{

    public ErrorResponse(AppException exception) {
        this.error_code = exception.getCode();
        this.msg = exception.getMsg();
        this.status = exception.getStatus();
        this.result = false;

    }

}
