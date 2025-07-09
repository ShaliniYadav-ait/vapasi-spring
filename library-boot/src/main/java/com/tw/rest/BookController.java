package com.tw.rest;

import com.tw.entity.Book;
import com.tw.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/book")
public class BookController {

    @Autowired
    private BookService bookService;

    @PostMapping(value = "/add", consumes = "application/json", produces = "application/json")
    public Book save(@RequestBody Book book) {
        return bookService.save(book);
    }

    @GetMapping(value = "/findByIsbn", produces = "application/json")
    public Book findByIsbn(@RequestParam("isbn") int isbn) {
        return bookService.findByIsbn(isbn);
    }

    @GetMapping(value = "/findAll", produces = "application/json")
    public List<Book> findAll() {
        return bookService.findAll();
    }

    @PutMapping(value = "/deleteByIsbn", produces = "application/json")
    public boolean deleteByIsbn(@RequestParam("isbn") int isbn) {
        return bookService.deleteByIsbn(isbn);
    }

    @GetMapping(value = "/findByAuthor", produces = "application/json")
    public List<Book> findByAuthor(@RequestParam("author") String author) {
        return bookService.findByAuthor(author);
    }

    @GetMapping(value = "/findByGenre", produces = "application/json")
    public List<Book> findByGenre(@RequestParam("genre") String genre) {
        return bookService.findByGenre(genre);
    }

    @GetMapping(value = "/findByTitle", produces = "application/json")
    public Book findByTitle(@RequestParam("title")String title) {
        return bookService.findByTitle(title);
    }

    @GetMapping(value = "/findByPriceRange", produces = "application/json")
    public List<Book> findByPriceRange(@RequestParam("min") double priceMin,@RequestParam("max") double priceMax) {
        return bookService.findByPriceRange(priceMin, priceMax);
    }

}
