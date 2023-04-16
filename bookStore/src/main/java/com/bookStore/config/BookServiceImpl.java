package com.bookStore.config;

import com.bookStore.repository.BookRepository;
import com.bookStore.service.BookService;

public class BookServiceImpl extends BookService {
    public BookServiceImpl(BookRepository bookRepository) {
        super();
    }
}
