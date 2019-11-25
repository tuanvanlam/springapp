package com.felt.coporation.springdemo.repository;

import com.felt.coporation.springdemo.entity.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<Author, String> {
}
