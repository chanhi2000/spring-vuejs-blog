package com.example.markiiimark.blog.repository;

import com.example.markiiimark.blog.domain.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Long> {
}
