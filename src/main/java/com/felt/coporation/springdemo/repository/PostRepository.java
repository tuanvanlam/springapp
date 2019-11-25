package com.felt.coporation.springdemo.repository;

import com.felt.coporation.springdemo.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, String> {
}
