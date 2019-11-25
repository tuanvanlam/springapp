package com.felt.coporation.springdemo.repository;

import com.felt.coporation.springdemo.entity.Tag;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TagRepository extends JpaRepository<Tag, String> {
}
