package com.felt.coporation.springdemo.controller;

import com.felt.coporation.springdemo.entity.Post;
import com.felt.coporation.springdemo.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class PostController {
    @Autowired
    PostService postService;

    @GetMapping(value = "/posts")
    @ResponseBody
    public List<Post> getAllPosts() {
        return postService.getAll();
    }

    @GetMapping(value = "/posts/data")
    @ResponseBody
    public List<Post> buildData() {
        return postService.buildDummyData();
    }
}
