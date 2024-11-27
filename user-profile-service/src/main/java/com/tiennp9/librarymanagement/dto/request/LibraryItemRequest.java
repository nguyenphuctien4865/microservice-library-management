package com.tiennp9.librarymanagement.dto.request;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class LibraryItemRequest {

    private String type;
    private String title;
    private Long authorId;
    private String format;

}