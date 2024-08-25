package com.example.backend.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
@Table(name = "books")
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "book_seq_gen")
    @SequenceGenerator(name = "book_seq_gen", sequenceName = "book_seq", allocationSize = 1)
    private Integer id;

    @Column(name = "Title")
    @NotEmpty(message = "Title shouldn't be empty")
    private String title;

    @Column(name = "Author")
    @NotEmpty(message = "Author shouldn't be empty")
    private String author;

    @Column(name = "ISBN")
    @NotEmpty(message = "ISBN shouldn't be empty")
    @Pattern(regexp = "^[0-9]{13}$", message = "Invalid ISBN number")
    private String isbn;

    @Column(name = "Price")
    private Double price;
}