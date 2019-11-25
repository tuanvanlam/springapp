package com.felt.coporation.springdemo.service;

import com.felt.coporation.springdemo.entity.Author;
import com.felt.coporation.springdemo.repository.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class BuildDummyDataAuthor implements CommonService<Author> {
    @Autowired
    AuthorRepository authorRepository;

    @Override
    public List<Author> buildDummyData() {
        List<Author> authors = new ArrayList<>();
        authors.add(new Author("Tuan"));
        authors.add(new Author("Linh"));
        authors.add(new Author("Cong"));
        return authors.stream().map(authorRepository::save).collect(Collectors.toList());
    }
}
