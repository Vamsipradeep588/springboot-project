package com.example.springboot_project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import com.example.springboot_project.model.Book;
import com.example.springboot_project.service.BookH2Service;
import org.springframework.web.server.ResponseStatusException;
import com.example.springboot_project.service.BookJpaService;
import java.util.*;

@RestController
public class BookController {

    @Autowired
    public BookJpaService bookService;

    @GetMapping("/books")
    public ArrayList<Book> getBooks() {
        return bookService.getBooks();
    }
    @GetMapping("/books/{bookId}/")
    public Book getBookById(@PathVariable("bookId") int bookId) {
        return bookService.getBookById(bookId);
    }
    @PostMapping("/books")
    public Book addBook(@RequestBody Book book) {
        return bookService.addBook(book);
    }
    @PutMapping("/books/{bookId}/")
    public Book updateBook(@PathVariable("bookId") int bookId, @RequestBody Book book) {
        return bookService.updateBook(bookId, book);
    }
    @DeleteMapping("/books/{bookId}/")
    public void deleteBook(@PathVariable("bookId") int bookId) {
        bookService.deleteBook(bookId);
    }
}