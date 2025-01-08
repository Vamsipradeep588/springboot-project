//package com.example.springboot_project.service;
//
//import com.example.springboot_project.model.Book;
//import com.example.springboot_project.model.BookRowMapper;
//import com.example.springboot_project.repository.BookRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.jdbc.core.JdbcTemplate;
//import org.springframework.stereotype.Service;
//import org.springframework.web.server.ResponseStatusException;
//
//import java.util.ArrayList;
//import java.util.List;
//
//@Service
//public class BookH2Service implements BookRepository {
//    @Autowired
//    private JdbcTemplate db;
//    @Override
//    public ArrayList<Book> getBooks() {
//        List<Book> bookList = db.query("select * from book", new BookRowMapper());
//        ArrayList<Book> books = new ArrayList<>(bookList);
//        return books;
//    }
//    @Override
//    public Book getBookById(int bookId) {
//        try {
//            Book book = db.queryForObject("select * from book where id = ?", new BookRowMapper(), bookId);
//            return book;
//        } catch(Exception e) {
//            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
//        }
//    }
//    @Override
//    public Book addBook(Book book) {
//        db.update("insert into book(name, imageUrl) values(?, ?)", book.getName(), book.getImageUrl());
//        Book bookSaved = db.queryForObject("select * from book where name = ? and imageUrl = ?", new BookRowMapper(), book.getName(), book.getImageUrl());
//        return bookSaved;
//    }
//    @Override
//    public Book updateBook(int bookId, Book book) {
//        if (book.getName() != null) {
//            db.update("update book set name = ? where id = ?", book.getName(), bookId);
//        }
//        if (book.getImageUrl() != null) {
//            db.update("update book set imageUrl = ? where id = ?", book.getImageUrl(), bookId);
//        }
//        return getBookById(bookId);
//    }
//    @Override
//    public void deleteBook(int bookId) {
//        db.update("delete from book where id=?",bookId);
//    }
//}