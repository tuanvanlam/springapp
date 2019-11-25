package com.felt.coporation.springdemo.service;

import com.felt.coporation.springdemo.entity.Author;
import com.felt.coporation.springdemo.entity.Post;
import com.felt.coporation.springdemo.entity.Tag;
import com.felt.coporation.springdemo.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

@Service
public class BuildDummyDataPost implements CommonService<Post> {
    @Autowired
    PostRepository postRepository;

    @Autowired
    BuildDummyDataTag buildDummyDataTag;

    @Autowired
    BuildDummyDataAuthor buildDummyDataAuthor;

    @Override
    public List<Post> buildDummyData() {
        List<String> postNames = buildPostName();
        List<Tag> tags = buildDummyDataTag.buildDummyData();
        return postNames.stream()
                .map(postName -> {
                    Post post = new Post(getRandomName(), getRandomAuthor(), tags);
                    return postRepository.save(post);
                })
                .collect(Collectors.toList());
    }

    public Author getRandomAuthor() {
        List<Author> authors = buildDummyDataAuthor.buildDummyData();
        Random rand = new Random();
        int index = rand.nextInt(2);
        return authors.get(index);
    }

    public String getRandomName() {
        List<String> postNames = buildPostName();
        Random rand = new Random();
        int index = rand.nextInt(2);
        return postNames.get(index);
    }

    public List<String> buildPostName() {
        List<String> postNames = new ArrayList<>();
        postNames.add("Spring");
        postNames.add("Hibernate");
        postNames.add("H2 Database");
        return postNames;
    }
}
