package com.JPA.Spring_Jpa_part3.controller;

import com.JPA.Spring_Jpa_part3.entity.Author;
import com.JPA.Spring_Jpa_part3.repository.AuthorRepository;
import org.springframework.web.bind.annotation.*;



@RestController
@RequestMapping("/authors")
public class AuthorController {

    private final AuthorRepository repository;

    public AuthorController(AuthorRepository repository) {
        this.repository = repository;
    }

    @PostMapping("/add")
    public Author saveAuthor(@RequestBody Author author) {
        return repository.save(author);
    }
}