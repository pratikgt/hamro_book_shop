package com.example.backend.controller;

import com.example.backend.entity.Book;
import com.example.backend.pojo.BookPojo;
import com.example.backend.pojo.GlobalApiResponse;
import com.example.backend.service.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/book")
@RequiredArgsConstructor
public class BookController {

    private final BookService bookService;

    @PostMapping("/save")
    public GlobalApiResponse<String> save(@RequestBody BookPojo bookPojo) {
        GlobalApiResponse<String> globalApiResponse = new GlobalApiResponse<>();
        globalApiResponse.setStatus(200);
        globalApiResponse.setMessage("Successfully saved");
        globalApiResponse.setData("saved");
        bookService.saveData(bookPojo);
        return globalApiResponse;
    }

    @GetMapping("/get")
    public GlobalApiResponse<List<Book>> getData() {
        GlobalApiResponse<List<Book>> globalApiResponse = new GlobalApiResponse<>();
        globalApiResponse.setStatus(200);
        globalApiResponse.setMessage("Successfully retrieved the data");
        globalApiResponse.setData(bookService.getData());
        return globalApiResponse;
    }

    @GetMapping("/get/{id}")
    public GlobalApiResponse<Optional<Book>> getById(@PathVariable Integer id) {
        GlobalApiResponse<Optional<Book>> globalApiResponse = new GlobalApiResponse<>();
        globalApiResponse.setStatus(200);
        globalApiResponse.setMessage("Successfully retrieved the data by id");
        globalApiResponse.setData(bookService.getById(id));
        return globalApiResponse;
    }

    @DeleteMapping("/delete/{id}")
    public GlobalApiResponse<Integer> delete(@PathVariable Integer id) {
        GlobalApiResponse<Integer> globalApiResponse = new GlobalApiResponse<>();
        globalApiResponse.setStatus(200);
        globalApiResponse.setMessage("Successfully deleted");
        globalApiResponse.setData(id);
        bookService.deleteData(id);
        return globalApiResponse;
    }

    @PutMapping("/update")
    public GlobalApiResponse<Integer> update(@RequestBody BookPojo bookPojo) {
        GlobalApiResponse<Integer> globalApiResponse = new GlobalApiResponse<>();
        globalApiResponse.setStatus(200);
        globalApiResponse.setMessage("Successfully updated the data");
        globalApiResponse.setData(bookPojo.getId());
        bookService.saveData(bookPojo);
        return globalApiResponse;
    }
}