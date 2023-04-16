package com.bookStore.config;

import com.bookStore.repository.BookRepository;
import com.bookStore.service.BookService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public BookRepository bookRepository() {
        return new BookRepositoryImpl();
    }

    @Bean
    public BookService bookService() {
        return new BookServiceImpl(bookRepository());
    }
}
