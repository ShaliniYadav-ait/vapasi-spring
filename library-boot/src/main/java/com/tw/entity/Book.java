package com.tw.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data // lombok
@Entity
@Table(name="books")
public class Book {
    // to mark a field in an entity class as the primary key
    @Id
    private int isbn;
    // if @Column has name along with length that name is going to be used in the db if not it will take the variable name as column name
    @Column(length = 30)
    private String title;
    @Column(length = 30)
    private String author;
    @Column(length = 15)
    private String genre;
    private int price;

}
