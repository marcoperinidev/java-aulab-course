package com.bookStore.service;

import com.bookStore.entity.Book;
import com.bookStore.repository.BookRepository;
import org.springframework.stereotype.Service;

@Service
public class BookService {

    public BookRepository bookRepo = null;

    public BookService() {
    }

    public void save(Book b) {
        bookRepo.save(b);
    }
}
