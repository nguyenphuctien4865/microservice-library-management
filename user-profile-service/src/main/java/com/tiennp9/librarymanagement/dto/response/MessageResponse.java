package com.tiennp9.librarymanagement.dto.response;

import lombok.Data;

@Data
public class MessageResponse {
    private String message;

    public MessageResponse(String message) {
        this.message = message;
    }

    // Getter và Setter
}
