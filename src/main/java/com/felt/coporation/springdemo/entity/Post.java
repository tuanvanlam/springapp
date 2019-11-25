package com.felt.coporation.springdemo.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.util.List;
import java.util.UUID;

@Entity
@Table
@Getter
@Setter
@NoArgsConstructor
@ToString
public class Post {

    @Id
    String id;

    String name;

    @ManyToOne
    Author author;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "post_tag")
    List<Tag> tags;

    public Post(String name, Author author, List<Tag> tags) {
        this.id = UUID.randomUUID().toString();
        this.name = name;
        this.author = author;
        this.tags = tags;
    }
}
