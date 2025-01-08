package com.example.springboot_project.repository;
import com.example.springboot_project.model.Publisher;
import java.util.ArrayList;
import com.example.springboot_project.model.Book;
public interface BookRepository {
    ArrayList<Book> getBooks();
    Book getBookById(int bookId);
    Book addBook(Book book);
    Book updateBook(int bookId, Book book);
    void deleteBook(int bookId);
    Publisher getBookPublisher(int bookId);
}