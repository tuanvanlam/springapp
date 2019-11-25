package com.felt.coporation.springdemo.service;

import com.felt.coporation.springdemo.entity.Tag;
import com.felt.coporation.springdemo.repository.TagRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TagService {
    @Autowired
    TagRepository tagRepository;

    @Autowired
    BuildDummyDataTag buildDummyDataTag;

    public List<Tag> getAll() {
        return tagRepository.findAll();
    }

    public List<Tag> buildDummyData() {
        return buildDummyDataTag.buildDummyData();
    }
}
