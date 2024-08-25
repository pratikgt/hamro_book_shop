package com.example.backend.pojo;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class BookPojo {
    private Integer id;

    @NotEmpty(message = "Title shouldn't be empty")
    private String title;

    @NotEmpty(message = "Author shouldn't be empty")
    private String author;

    @NotEmpty(message = "ISBN shouldn't be empty")
    @Pattern(regexp = "^[0-9]{13}$", message = "Invalid ISBN number")
    private String isbn;

    private Double price;
}