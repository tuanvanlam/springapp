package com.felt.coporation.springdemo.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.UUID;

@Entity
@Table
@Getter
@Setter
@NoArgsConstructor
@ToString
public class Author {
    @Id
    String id;

    String name;

    public Author(String name) {
        this.id = UUID.randomUUID().toString();
        this.name = name;
    }
}
