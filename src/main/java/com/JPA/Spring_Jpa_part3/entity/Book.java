package com.JPA.Spring_Jpa_part3.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String bookName;


//    @ManyToOne
//    @JoinColumn(name = "author_id")
//    private Author author;

    @ManyToMany(mappedBy = "books")
    private List<Author> authors;

    public Book() {}

    public Book(String bookName) {
        this.bookName = bookName;
    }

    public Long getId() { return id; }

    public String getBookName() { return bookName; }
    public void setBookName(String bookName) { this.bookName = bookName; }
}