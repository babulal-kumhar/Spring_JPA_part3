package com.JPA.Spring_Jpa_part3.repository;

import com.JPA.Spring_Jpa_part3.entity.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<Author, Long> {
}