package com.felt.coporation.springdemo.controller;

import com.felt.coporation.springdemo.entity.Author;
import com.felt.coporation.springdemo.service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class AuthorController {
    @Autowired
    AuthorService authorService;

    @GetMapping(value = "/authors")
    @ResponseBody
    public List<Author> getAllAuthors() {
        return authorService.getAll();
    }

    @GetMapping(value = "/authors/data")
    @ResponseBody
    public List<Author> buildData() {
        return authorService.buildDummyData();
    }
}
