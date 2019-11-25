package com.felt.coporation.springdemo.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Entity
@Table
@Getter
@Setter
@NoArgsConstructor
@ToString(exclude = "posts")
public class Tag {
    @Id
    String id;
    String name;

    @ManyToMany(fetch = FetchType.LAZY, mappedBy = "tags")
    List<Post> posts = new ArrayList<>();

    public Tag(String name) {
        this.id = UUID.randomUUID().toString();
        this.name = name;
    }
}
