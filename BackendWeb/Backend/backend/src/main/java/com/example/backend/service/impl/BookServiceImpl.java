package com.example.backend.service.impl;

import com.example.backend.entity.Book;
import com.example.backend.pojo.BookPojo;
import com.example.backend.repository.BookRepository;
import com.example.backend.service.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class BookServiceImpl implements BookService {

    private final BookRepository bookRepository;

    @Override
    public void saveData(BookPojo bookPojo) {
        Book book = new Book();
        book.setId(bookPojo.getId());
        book.setTitle(bookPojo.getTitle());
        book.setAuthor(bookPojo.getAuthor());
        book.setIsbn(bookPojo.getIsbn());
        book.setPrice(bookPojo.getPrice());
        bookRepository.save(book);
    }

    @Override
    public List<Book> getData() {
        return bookRepository.findAll();
    }

    @Override
    public void deleteData(Integer id) {
        bookRepository.deleteById(id);
    }

    @Override
    public Optional<Book> getById(Integer id) {
        return bookRepository.findById(id);
    }
}