package com.felt.coporation.springdemo.service;

import com.felt.coporation.springdemo.entity.Post;
import com.felt.coporation.springdemo.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostService {
    @Autowired
    PostRepository postRepository;

    @Autowired
    BuildDummyDataPost buildDummyDataPost;

    public List<Post> getAll() {
        return postRepository.findAll();
    }

    public List<Post> buildDummyData() {
        return buildDummyDataPost.buildDummyData();
    }
}
