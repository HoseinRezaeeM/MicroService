package com.example.bookinforesources.controller;

import com.example.bookinforesources.domain.Book;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/bookinfo")
public class BookInfoResourceController {
    @GetMapping("/{id}")
    public Book getBookInfo(@PathVariable("id") int id) {
        return new Book(id, "Simorgh");
    }
}
