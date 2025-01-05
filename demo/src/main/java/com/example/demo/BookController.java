package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

// import com.example.demo.BookService;

@RestController
public class BookController {
    BookService bookService = new BookService();

    @GetMapping("/books")
    public ArrayList<Book> getBooks() {
        return bookService.getBooks();
    }
}