package com.JPA.Spring_Jpa_part3.entity;

import jakarta.persistence.*;
import java.util.List;

@Entity
public class Author {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @Embedded
    private Address address;

    @ElementCollection
    private List<String> subjects;

//    @OneToOne(cascade = CascadeType.ALL)
//    @JoinColumn(name = "book_id")
//    private Book book;
//@OneToMany(mappedBy = "author", cascade = CascadeType.ALL)
//private List<Book> books;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(
            name = "author_book",
            joinColumns = @JoinColumn(name = "author_id"),
            inverseJoinColumns = @JoinColumn(name = "book_id")
    )
    private List<Book> books;

    public Author() {}

    public Author(String name, Address address, List<String> subjects) {
        this.name = name;
        this.address = address;
        this.subjects = subjects;
    }

    public Long getId() { return id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public Address getAddress() { return address; }
    public void setAddress(Address address) { this.address = address; }

    public List<String> getSubjects() { return subjects; }
    public void setSubjects(List<String> subjects) { this.subjects = subjects; }
}