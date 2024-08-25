package com.example.backend.service;

import com.example.backend.entity.Book;
import com.example.backend.pojo.BookPojo;

import java.util.List;
import java.util.Optional;

public interface BookService {
    void saveData(BookPojo bookPojo);
    List<Book> getData();
    void deleteData(Integer id);
    Optional<Book> getById(Integer id);
}