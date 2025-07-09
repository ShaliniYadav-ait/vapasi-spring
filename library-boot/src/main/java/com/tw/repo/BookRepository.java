package com.tw.repo;

import com.tw.LibraryBootApplication;
import com.tw.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

// extending  JpaRepository<Book, Long>  takes care of standard CRUD operations
public interface BookRepository extends JpaRepository<Book, Long> {

    // for additional functionality we need to add methods
    List<Book> findByAuthor(String author);
    List<Book> findByGenre(String genre);
    Book findByTitle(String title);
    // jpa can relate the above 3 as they have the column name as field being passed
    // for price range we need to use priceBetween that jpa will understand or else if we want to keep the name as it is then we have to
    // provide our own query explicitly

    @Query("FROM Book WHERE price BETWEEN :priceMin AND :priceMax")
    List<Book> findByPriceRange(double priceMin, double priceMax);

// other way with different name in the query will be to use @Param and pass the relation
//    @Query("FROM Book WHERE price BETWEEN :min AND :max")
//    List<Book> findByPriceRange(@Param("min") double priceMin, @Param("max") double priceMax);


//    *********
    // we don't need to implement this interface, spring will take care of the rest after making the class and interface
}
