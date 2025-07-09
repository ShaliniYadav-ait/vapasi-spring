package com.tw.service;

import com.tw.entity.Book;

import java.util.List;

public interface BookService {

    // additional methods
    Book save(Book book);
    Book findByIsbn(int isbn);
    List<Book> findAll();
    boolean deleteByIsbn(int isbn);
//    boolean delete(Book book);          ** TODO: check this

    // methods form the Repository
    List<Book> findByAuthor(String author);
    List<Book> findByGenre(String genre);
    Book findByTitle(String title);
    List<Book> findByPriceRange(double priceMin, double priceMax);
}
