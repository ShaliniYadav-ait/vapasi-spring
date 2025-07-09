package com.tw.service;

import com.tw.entity.Book;
import com.tw.repo.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


// this is going to be spring bean and will be used as @Autowired this we need to tag @Service which depends on @Repository
@Service
public class BookServiceImpl implements BookService {

    // thus we need to @Autowire the BookRepository
    @Autowired
    BookRepository bookRepository;

    @Override
    public Book save(Book book) {
        return bookRepository.save(book);
    }

    @Override
    public Book findByIsbn(int isbn) {
        return bookRepository.findById(isbn).orElse(null);
    }

    @Override
    public List<Book> findAll() {
        return bookRepository.findAll();
    }

    @Override
    public boolean deleteByIsbn(int isbn) {
        bookRepository.deleteById(isbn);
        return false;
    }

    @Override
    public List<Book> findByAuthor(String author) {
        return bookRepository.findByAuthor(author);
    }

    @Override
    public List<Book> findByGenre(String genre) {
        return bookRepository.findByGenre(genre);
    }

    @Override
    public Book findByTitle(String title) {
        return bookRepository.findByTitle(title);
    }

    @Override
    public List<Book> findByPriceRange(double priceMin, double priceMax) {
        return bookRepository.findByPriceRange(priceMin, priceMax);
    }
}
