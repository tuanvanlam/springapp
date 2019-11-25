package com.felt.coporation.springdemo.service;

import com.felt.coporation.springdemo.entity.Tag;
import com.felt.coporation.springdemo.repository.TagRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class BuildDummyDataTag implements CommonService<Tag> {
    @Autowired
    TagRepository tagRepository;

    @Override
    public List<Tag> buildDummyData() {
        List<Tag> tags = new ArrayList<>();
        tags.add(new Tag("Java"));
        tags.add(new Tag("C#"));
        tags.add(new Tag("C++"));
        return tags.stream().map(tagRepository::save).collect(Collectors.toList());
    }
}
