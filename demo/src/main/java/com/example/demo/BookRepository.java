package com.example.demo;

import java.util.*;

public interface BookRepository {
    ArrayList<Book> getBooks();
    Book getBookById(int bookId);
}