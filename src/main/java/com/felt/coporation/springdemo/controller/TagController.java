package com.felt.coporation.springdemo.controller;

import com.felt.coporation.springdemo.entity.Tag;
import com.felt.coporation.springdemo.service.TagService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class TagController {
    @Autowired
    TagService tagService;

    @GetMapping(value = "/tags")
    @ResponseBody
    public List<Tag> getAllTags() {
        return tagService.getAll();
    }

    @GetMapping(value = "/tags/data")
    @ResponseBody
    public List<Tag> buildData() {
        return tagService.buildDummyData();
    }
}
